package com.neil.web.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.neil.common.domain.City;
import com.neil.common.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityApi {

    @Reference
    private CityService cityService;

    @GetMapping("/city/{name}")
    public City getCityByName(@PathVariable("name") String name) {
        City city = cityService.findByName(name);
        return city;
    }

    @GetMapping("/city")
    public List<City> getAll() {
        return cityService.findAll();
    }

    @PostMapping("/city")
    public Integer save(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @PutMapping("/city/{id}")
    public Integer update(@PathVariable("id") Integer id, @RequestBody City city) {
        return cityService.updateCity(id, city);
    }

    @DeleteMapping("/city/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        return cityService.deleteCity(id);
    }

}
