package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.pojo.GoodsType;
import com.qianfeng.service.GoodsTypeService;
import com.qianfeng.vo.ResultVo;

@RestController
public class GoodsTypeController {

	@Autowired
	private GoodsTypeService goodsTypeService;
	
	@RequestMapping("/GoodsType.do")
	public ResultVo goodsType(Integer gtKind) {
		
		return goodsTypeService.selectByKind(gtKind);
		
	}
	
	@PostMapping("/saveGoodsType.do")
	public ResultVo saveGoodsType(GoodsType goodsType) {
		
		return goodsTypeService.saveGoodsType(goodsType);
		
	}
	
	@GetMapping("/menulist.do")
	public ResultVo findAllGoodsType() {
		return goodsTypeService.findAllGoodsType();
	}
}
