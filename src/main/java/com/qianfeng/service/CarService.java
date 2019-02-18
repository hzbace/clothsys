package com.qianfeng.service;

import com.qianfeng.pojo.Car;
import com.qianfeng.vo.ResultVo;

public interface CarService {

	ResultVo findAllCarByUserId(Integer userId);
	
	ResultVo deleteCarById(Integer carId);
	
	Integer addCar(Car car);
}
