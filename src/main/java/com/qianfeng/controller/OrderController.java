package com.qianfeng.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Order;
import com.qianfeng.service.orderService;
import com.qianfeng.vo.ResultVo;
import com.qianfeng.vo.orderVo;

@Controller
public class OrderController {
	@Autowired
	orderService service;
	
	@GetMapping("selectAllOrder.do")
	@ResponseBody
	public ResultVo selectAllOrder() {
		List<orderVo> list = service.findAllOrder();
		if (list != null) {
			return ResultVo.setOK(list);
		}
		
		return ResultVo.setERROR();
	}
	
	@GetMapping("selectOrder.do")
	@ResponseBody
	public ResultVo selectOrder(String userName,Integer orderStatus) {
		List<orderVo> list = service.findOrder(userName, orderStatus);
		if (list != null) {
			return ResultVo.setOK(list);
		}
		
		return ResultVo.setERROR();
	}
	
	@PostMapping("updateStatus.do")
	@ResponseBody
	public ResultVo updateStatus(Integer orderId) {
		Integer type = service.updateStatus(orderId);
		if (type > 0) {
			return ResultVo.setOK(type);
		}
		
		return ResultVo.setERROR();
	}
	
	@GetMapping("selectOrderById.do")
	@ResponseBody
	public ResultVo selectOrderById(Integer orderId) {
		Map<String, Object> map = service.selectOrderById(orderId);
		return ResultVo.setOK(map);
	}
	
	
	@GetMapping("saveOrder.do")
	@ResponseBody
	public ResultVo saveOrder(Order order) {
		System.out.println(order);
		return service.saveOrder(order);
	}
}
