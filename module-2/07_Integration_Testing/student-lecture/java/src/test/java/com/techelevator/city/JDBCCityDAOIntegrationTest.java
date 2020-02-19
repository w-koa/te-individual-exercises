package com.techelevator.city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JDBCCityDAOIntegrationTest {

	private static final String TEST_COUNTRY = "XYZ";

	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * session and hence the same database transaction */
	private static SingleConnectionDataSource dataSource;
	private JDBCCityDAO dao;

	// Before running test, this method initializes datasource
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		// Can disable auto-commit so rollback available after each test.
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() {
		dataSource.destroy();
		
	}
	
	@Before
	public void setup() {
		String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea" +
				", indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) " +
				"VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, " +
				"NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertCountry, TEST_COUNTRY);
		dao = new JDBCCityDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void save_new_city_and_read() {
		City city = getCity("SQL Station", "South Dakota", TEST_COUNTRY, 65535);
		dao.save(city);
		City savedCity = dao.findCityById(city.getId());
		
		assertNotEquals(null, city.getId());
		assertEquals(city.getDistrict(), savedCity.getDistrict());
		assertEquals(city.getCountryCode(), savedCity.getCountryCode());
		assertEquals(city.getPopulation(), savedCity.getPopulation());
		assertEquals(city.getId(), savedCity.getId());
		assertEquals(city.getName(), savedCity.getName());
	}
	
	@Test
	public void returns_cities_by_countrycode() {
		City city = getCity("SQL Station", "South Dakota", TEST_COUNTRY, 65535);
		dao.save(city);
		
		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
		assertNotNull(results);
		assertEquals(1, results.size());
		City savedCity = results.get(0);
		assertEquals(city.getDistrict(), savedCity.getDistrict());
		assertEquals(city.getCountryCode(), savedCity.getCountryCode());
		assertEquals(city.getPopulation(), savedCity.getPopulation());
		assertEquals(city.getId(), savedCity.getId());
		assertEquals(city.getName(), savedCity.getName());
	}
	
	// Method to create city object.
	private City getCity(String name, String district, String countrycode, int population) {
		City city = new City();
		city.setName(name);
		city.setDistrict(district);
		city.setCountryCode(countrycode);
		city.setPopulation(population);
		return city;
		
	}
}
