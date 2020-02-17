package com.techelevator.city;

import java.util.List;

public interface CityDAO {

	public City findCityById(int id);
	public void save(City newCity);
	public List<City> findCitiesByCountryCode(String countrycode);
	public List<City> findCitiesByDistrict(String district);
	public void updateCity(City city);
	public void deleteCity(City city);
}
