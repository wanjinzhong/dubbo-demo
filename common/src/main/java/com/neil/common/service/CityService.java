package com.neil.common.service;

import com.neil.common.domain.City;

import java.util.List;

public interface CityService {

    City findByName(String name);

    List<City> findAll();

    Integer saveCity(City city);

    Integer updateCity(Integer id, City city);

    Integer deleteCity(Integer id);
}
