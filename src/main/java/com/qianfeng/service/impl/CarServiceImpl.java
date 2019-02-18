package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CarMapper;
import com.qianfeng.pojo.Car;
import com.qianfeng.service.CarService;
import com.qianfeng.vo.ResultVo;

@Service
public class CarServiceImpl implements CarService{

	
	@Autowired
	private CarMapper carMapper;
	
	@Override
	public ResultVo findAllCarByUserId(Integer userId) {
		// TODO Auto-generated method stub
		
		return ResultVo.setOK(carMapper.findAllCarByUserId(userId));
	}

	@Override
	public ResultVo deleteCarById(Integer carId) {
		// TODO Auto-generated method stub
		if (carMapper.deleteByPrimaryKey(carId) > 0) {
			return ResultVo.setOK("OK");
		}else {
			return ResultVo.setERROR("添加失败");
		}
		
	}

	@Override
	public Integer addCar(Car car) {
		if (car.getCarGoodsColor().equals("") || car.getCarGoodsColor() == null) {
			car.setCarGoodsColor("black");
		}
		if (car.getCarGoodsSize().equals("") || car.getCarGoodsSize() == null) {
			car.setCarGoodsSize("s");
		}
		if (car.getCarGoodsCount() == 0) {
			car.setCarGoodsCount(1);
		}
		
		Integer type = carMapper.insertSelective(car);
		
		return type;
	}
}
