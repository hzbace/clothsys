package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Car;
import com.qianfeng.vo.CarVo;

public interface CarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
    
    List<CarVo> findAllCarByUserId(Integer userId);
    
    List<Car> selectAllCarByUserId(Integer userId);
}