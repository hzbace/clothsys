package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Order;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.orderVo;

public interface orderService {

	List<orderVo> findAllOrder();

	List<orderVo> findOrder(String userName,Integer orderStatus);
	
	Integer updateStatus(Integer orderId);
	
	Map<String, Object> selectOrderById(Integer orderId);
	
	int getMaxOrderId();
	
	ResultVo saveOrder(Order order);
}
