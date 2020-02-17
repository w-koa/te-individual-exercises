package com.techelevator.city;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCCityDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public City findCityById(int id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "
				+ "FROM city WHERE id = ?";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if (results.next()) {
			theCity = mapRowToCity(results);
		}
		return null;
	}

	private City mapRowToCity(SqlRowSet results) {
		City theCity = new City();
		theCity.setId(results.getInt("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountrycode(results.getString("countrycode"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
		
	}
	@Override
	public void save(City newCity) {
		// Insert into database
		String sqlInsertCity = "INSERT INTO city(name, countrycode, district, population) "
				+ "VALUES(?, ?, ?, ?)"; // Lets postgres get next id number automatically
		jdbcTemplate.update(sqlInsertCity, 
				newCity.getName(), 
				newCity.getCountrycode(), 
				newCity.getDistrict(), 
				newCity.getPopulation());
		
	}

	@Override
	public List<City> findCitiesByCountryCode(String countrycode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findCitiesByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCity(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCity(City city) {
		// TODO Auto-generated method stub
		
	}

}
