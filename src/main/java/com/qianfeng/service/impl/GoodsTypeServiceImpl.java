package com.qianfeng.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.GoodsTypeMapper;
import com.qianfeng.pojo.GoodsType;
import com.qianfeng.service.GoodsTypeService;
import com.qianfeng.vo.GoodsTypeMenu;
import com.qianfeng.vo.ResultVo;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Autowired
	private GoodsTypeMapper goodsTypeMapper;

	@Override
	public ResultVo selectByKind(Integer gtKind) {
		// TODO Auto-generated method stub
		List<GoodsType> list = goodsTypeMapper.selectByKind(gtKind);
		if (list != null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo saveGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		if(goodsTypeMapper.insertSelective(goodsType) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo findAllGoodsType() {
		// TODO Auto-generated method stub
		List<GoodsType> list = goodsTypeMapper.selectAll();
		GoodsTypeMenu gtm1 = new GoodsTypeMenu();
		GoodsTypeMenu gtm2 = new GoodsTypeMenu();
		GoodsTypeMenu gtm3 = new GoodsTypeMenu();
		gtm1.setKind("饰品");
		gtm1.setList(new ArrayList<GoodsType>());
		gtm2.setKind("男装");
		gtm2.setList(new ArrayList<GoodsType>());
		gtm3.setKind("女装");
		gtm3.setList(new ArrayList<GoodsType>());
		if(list != null) {
			
			for (GoodsType goodsType : list) {
				
				if (goodsType.getGtKind() == 1) {
					gtm1.getList().add(goodsType);
				}else if(goodsType.getGtKind() == 2) {
					gtm2.getList().add(goodsType);
				}else if(goodsType.getGtKind() == 3) {
					gtm3.getList().add(goodsType);
				}
			}
		}
		
		
		List<GoodsTypeMenu> menuList = new ArrayList<GoodsTypeMenu>();
		menuList.add(gtm1);
		menuList.add(gtm2);
		menuList.add(gtm3);
		return ResultVo.setOK(menuList);
	}

	@Override
	public List<GoodsTypeMenu> findAllType() {
		// TODO Auto-generated method stub
		List<GoodsType> list = goodsTypeMapper.selectAll();
		GoodsTypeMenu gtm1 = new GoodsTypeMenu();
		GoodsTypeMenu gtm2 = new GoodsTypeMenu();
		GoodsTypeMenu gtm3 = new GoodsTypeMenu();
		gtm1.setKind("饰品");
		gtm1.setList(new ArrayList<GoodsType>());
		gtm2.setKind("男装");
		gtm2.setList(new ArrayList<GoodsType>());
		gtm3.setKind("女装");
		gtm3.setList(new ArrayList<GoodsType>());
		if(list != null) {
			
			for (GoodsType goodsType : list) {
				
				if (goodsType.getGtKind() == 1) {
					gtm1.getList().add(goodsType);
				}else if(goodsType.getGtKind() == 2) {
					gtm2.getList().add(goodsType);
				}else if(goodsType.getGtKind() == 3) {
					gtm3.getList().add(goodsType);
				}
			}
		}
		
		
		List<GoodsTypeMenu> menuList = new ArrayList<GoodsTypeMenu>();
		menuList.add(gtm1);
		menuList.add(gtm2);
		menuList.add(gtm3);
		return menuList;
	}
	
	
}
