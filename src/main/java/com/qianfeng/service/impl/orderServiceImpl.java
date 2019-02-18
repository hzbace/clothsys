package com.qianfeng.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CarMapper;
import com.qianfeng.dao.OrderMapper;
import com.qianfeng.dao.PersonMapper;
import com.qianfeng.pojo.Car;
import com.qianfeng.pojo.Order;
import com.qianfeng.pojo.Person;
import com.qianfeng.service.orderService;
import com.qianfeng.vo.CarVo;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.orderVo;

@Service
public class orderServiceImpl implements orderService {
	
	@Autowired
	OrderMapper orderDao;
	
	@Autowired
	CarMapper carDao;
	
	@Autowired
	PersonMapper personDao;
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public List<orderVo> findAllOrder() {
		List<orderVo> list = orderDao.selectAllOrder();
		
		return list;
	}

	@Override
	public List<orderVo> findOrder(String userName, Integer orderStatus) {
		List<orderVo> list = orderDao.selectOrder(userName, orderStatus);
		return list;
	}

	@Override
	public Integer updateStatus(Integer orderId) {
		Integer type = orderDao.updateStatus(orderId);
		return type;
	}

	@Override
	public Map<String, Object> selectOrderById(Integer orderId) {
		Order order = orderDao.selectByPrimaryKey(orderId);
		List<CarVo> CarList = carDao.findAllCarByUserId(order.getOrderUserId());
		Person person = personDao.selectByPrimaryKey(personDao.getMaxPerId());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order", order);
		map.put("CarList", CarList);
		map.put("person", person);
		return map;
	}

	@Override
	public int getMaxOrderId() {
		// TODO Auto-generated method stub
		return orderDao.getMaxOrderId();
	}

	@Override
	public ResultVo saveOrder(Order order) {
		// TODO Auto-generated method stub
		order.setOrderDate(new Date());
		order.setOrderPerId(personMapper.getMaxPerId());
		if (orderDao.insertSelective(order) > 0) {
			int maxId = orderDao.getMaxOrderId();
			return ResultVo.setOK(maxId);
		}else {
			return ResultVo.setERROR("添加失败");
		}
	
	}

}
