package com.qianfeng.service;


import java.util.List;

import com.qianfeng.pojo.GoodsType;
import com.qianfeng.vo.GoodsTypeMenu;
import com.qianfeng.vo.ResultVo;

public interface GoodsTypeService {

	public ResultVo selectByKind(Integer gtKind);
	
	public ResultVo saveGoodsType(GoodsType goodsType);
	
	public ResultVo findAllGoodsType();
	
	public List<GoodsTypeMenu> findAllType();
}
