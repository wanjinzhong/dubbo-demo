package com.neil.service.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.neil.common.domain.City;
import com.neil.common.service.CityService;
import com.neil.service.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findByName(String name) {
        City city = cityDao.findByCityName("%" + name + "%");
        return city;
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public Integer saveCity(City city) {
        return cityDao.insert(city);
    }

    @Override
    public Integer updateCity(Integer id, City city) {
        city.setId(id);
        return cityDao.update(city);
    }

    @Override
    public Integer deleteCity(Integer id) {
        return cityDao.delete(id);
    }
}
