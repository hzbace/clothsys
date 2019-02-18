package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianfeng.service.BrandService;
import com.qianfeng.vo.ResultVo;

@RestController
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@PostMapping("brandlist.do")
	public ResultVo findAll() {
		return brandService.findAllBrand();
	}
}
