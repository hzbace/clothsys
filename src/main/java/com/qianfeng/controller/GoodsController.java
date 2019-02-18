package com.qianfeng.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Goods;
import com.qianfeng.service.GoodsService;
import com.qianfeng.service.GoodsTypeService;
import com.qianfeng.vo.ResultVo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@Autowired
	private GoodsTypeService goodsTypeService;
	
	@RequestMapping("/findAllGoods.do")
	@ResponseBody
	public ResultVo findAllGoods() {
		return service.findAllGoods();
	}
	
	@RequestMapping("/findGoods.do")
	@ResponseBody
	public ResultVo findGoods(Integer goodsPid, Integer goodsHomeId, Integer goodsLevel) {
		return service.findGoods(goodsPid, goodsHomeId, goodsLevel);
	}
	
	@RequestMapping("/addGoods.do")
	@ResponseBody
	public ResultVo addGoods(Goods goods) {
		return service.addGoods(goods);
		
	}
	
	@RequestMapping("/updateGoods.do")
	@ResponseBody
	public ResultVo updateGoods(Goods goods) {
		return service.updateByGoods(goods);
	}
	
	
	@RequestMapping("/findGoodsByPid.do")
	@ResponseBody
	public ResultVo findGoodsByPid(Integer goodsPid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("menulist", goodsTypeService.findAllType());
		map.put("goodslist", service.selectByPid(goodsPid));
		return ResultVo.setOK(map);
	}
	
	@RequestMapping("/selectAllGoodsByType.do")
	@ResponseBody
	public ResultVo selectAllGoodsByType(Integer typeId) {
		Map<String, Object> map = service.selectAllGoodsByType(typeId);
		return ResultVo.setOK(map);
	}
	
	@RequestMapping("/selectGoodsByLevel.do")
	@ResponseBody
	public ResultVo findGoodsByLevel(Integer goodsLevel) {
		return service.findGoodsByLevel(goodsLevel);
	}
	
	@RequestMapping("/selectAllGoodsById.do")
	@ResponseBody
	public ResultVo selectAllGoodsById(Integer GoodsId) {
		Map<String, Object> map = service.selectAllGoodsById(GoodsId);
		return ResultVo.setOK(map);
	}
	
}
