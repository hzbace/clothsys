package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.Car;
import com.qianfeng.service.CarService;
import com.qianfeng.vo.ResultVo;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("carlistByUserId.do")
	public ResultVo carlistById(Integer userId) {
		return carService.findAllCarByUserId(userId);
	}
	
	@RequestMapping("/addCar.do")
	public ResultVo addCar(Car car) {
		
		return ResultVo.setOK(carService.addCar(car));
	}
	
	@RequestMapping("/deleteCar.do")
	public ResultVo deleteCarById(Integer carId) {
		
		return carService.deleteCarById(carId);
	}
}
