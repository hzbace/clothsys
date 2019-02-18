package com.qianfeng.service;


import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Goods;
import com.qianfeng.vo.ResultVo;

public interface GoodsService {
	ResultVo findAllGoods();
	
	ResultVo findGoods(Integer goodsPid, Integer goodsHomeId, Integer goodsLevel);
	
	ResultVo updateByGoods(Goods goods);
	
	ResultVo addGoods(Goods goods);
	
	Map<String, Object> selectAllGoodsByType(Integer typeId);

	ResultVo selectByPid(Integer goodsPid);
	
	ResultVo findGoodsByLevel(Integer goodsLevel);
	Map<String, Object> selectAllGoodsById(Integer GoodsId);
}
