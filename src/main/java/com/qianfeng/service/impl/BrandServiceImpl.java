package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.BrandMapper;
import com.qianfeng.service.BrandService;
import com.qianfeng.vo.ResultVo;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandMapper brandMapper;
	@Override
	public ResultVo findAllBrand() {
		// TODO Auto-generated method stub
		
		return ResultVo.setOK(brandMapper.findAll());
	}

}
