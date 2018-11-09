package com.neil.service.dao;

import com.neil.common.domain.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CityDao {
    @Select("select * from city where name like #{name}")
    City findByCityName(String name);

    @Select("select * from city")
    List<City> findAll();

    @Insert("insert into city(name, province, description) values(#{name}, #{province}, #{description})")
    Integer insert(City city);

    @Delete("delete from city where id = #{id}")
    Integer delete(Integer id);

    @Update("update city set name = #{name}, province=#{province}, description=#{description} where id=#{id}")
    Integer update(City city);
}
