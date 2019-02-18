package com.qianfeng.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qianfeng.dao.GoodsColorMapper;
import com.qianfeng.dao.GoodsMapper;
import com.qianfeng.dao.GoodsSizeMapper;
import com.qianfeng.pojo.Goods;
import com.qianfeng.pojo.GoodsColor;
import com.qianfeng.pojo.GoodsSize;
import com.qianfeng.service.GoodsService;
import com.qianfeng.vo.ResultVo;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsDao;
	
	@Autowired
	private GoodsColorMapper goodsColorDao;
	
	@Autowired
	private GoodsSizeMapper goodsSizeDao;

	@Override
	public ResultVo findAllGoods() {
		// TODO Auto-generated method stub
		List<Goods> list = goodsDao.findAllGoods();
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
		
	}

	@Override
	public ResultVo findGoods(Integer goodsPid, Integer goodsHomeId, Integer goodsLevel) {
		// TODO Auto-generated method stub
		
		Goods goods = new Goods();
		if (goodsPid!=null && goodsPid!=0) {
			goods.setGoodsPid(goodsPid);
		}
		if (goodsHomeId!=null && goodsHomeId!=0) {
			goods.setGoodsHomeId(goodsHomeId);
		}
		if (goodsLevel!=null && goodsLevel!=0) {
			goods.setGoodsLevel(goodsLevel);
		}
		List<Goods> list = goodsDao.findGoods(goods);
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
		
	}

	@Override
	public ResultVo updateByGoods(Goods goods) {
		// TODO Auto-generated method stub
		ResultVo rVo = new ResultVo();
		if (goodsDao.updateByGoods(goods)>0) {
			rVo.setOK(null);
		}else {
			rVo.setERROR();
		}
		
		return rVo;
	}

	@Override
	public ResultVo addGoods(Goods goods) {
		// TODO Auto-generated method stub
		ResultVo rVo = new ResultVo();
		if (goodsDao.insertSelective(goods)>0) {
			rVo.setOK(null);
		}else {
			rVo.setERROR();
		}
		return rVo;
	}

	@Override
	public ResultVo selectByPid(Integer goodsPid) {
		// TODO Auto-generated method stub
		List<Goods> list = goodsDao.selectByPid(goodsPid);
		return ResultVo.setOK(list);
	}

	@Override
	public Map<String, Object> selectAllGoodsByType(Integer typeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (typeId == 1) {
			List<Goods> GoodsList = goodsDao.selectAllGoodsByType();
			List<List<GoodsColor>> goodsColorList = new ArrayList<List<GoodsColor>>();
			List<List<GoodsSize>> goodsSizeList = new ArrayList<List<GoodsSize>>();
			for (Goods goods : GoodsList) {
				List<GoodsColor> goodsColors = goodsColorDao.selectAllGoodsColorsByGoodsId(goods.getGoodsId());
				List<GoodsSize> goodsSizes = goodsSizeDao.selectGoodsSizeAllById(goods.getGoodsId());
				goodsColorList.add(goodsColors);
				goodsSizeList.add(goodsSizes);
			}
			map.put("goodsList", GoodsList);
			map.put("goodsColorList", goodsColorList);
			map.put("goodsSizeList", goodsSizeList);
		} else if (typeId == 2) {
			List<Goods> goodsList = goodsDao.selectAllGoodsPriceByType();
			List<List<GoodsColor>> goodsColorList = new ArrayList<List<GoodsColor>>();
			List<List<GoodsSize>> goodsSizeList = new ArrayList<List<GoodsSize>>();
			for (Goods goods : goodsList) {
				List<GoodsColor> goodsColors = goodsColorDao.selectAllGoodsColorsByGoodsId(goods.getGoodsId());
				List<GoodsSize> goodsSizes = goodsSizeDao.selectGoodsSizeAllById(goods.getGoodsId());
				goodsColorList.add(goodsColors);
				goodsSizeList.add(goodsSizes);
			}
			map.put("goodsList", goodsList);
			map.put("goodsColorList", goodsColorList);
			map.put("goodsSizeList", goodsSizeList);
		} else if (typeId == 3) {
			List<Goods> goodsList = goodsDao.selectAllGoodsSalesByType();
			List<List<GoodsColor>> goodsColorList = new ArrayList<List<GoodsColor>>();
			List<List<GoodsSize>> goodsSizeList = new ArrayList<List<GoodsSize>>();
			for (Goods goods : goodsList) {
				List<GoodsColor> goodsColors = goodsColorDao.selectAllGoodsColorsByGoodsId(goods.getGoodsId());
				List<GoodsSize> goodsSizes = goodsSizeDao.selectGoodsSizeAllById(goods.getGoodsId());
				goodsColorList.add(goodsColors);
				goodsSizeList.add(goodsSizes);
			}
			map.put("goodsList", goodsList);
			map.put("goodsColorList", goodsColorList);
			map.put("goodsSizeList", goodsSizeList);
		} else if (typeId > 3) {
			List<Goods> goodsList = goodsDao.selectAllGoodsByPage(typeId);
			List<List<GoodsColor>> goodsColorList = new ArrayList<List<GoodsColor>>();
			List<List<GoodsSize>> goodsSizeList = new ArrayList<List<GoodsSize>>();
			for (Goods goods : goodsList) {
				List<GoodsColor> goodsColors = goodsColorDao.selectAllGoodsColorsByGoodsId(goods.getGoodsId());
				List<GoodsSize> goodsSizes = goodsSizeDao.selectGoodsSizeAllById(goods.getGoodsId());
				goodsColorList.add(goodsColors);
				goodsSizeList.add(goodsSizes);
			}
			map.put("goodsList", goodsList);
			map.put("goodsColorList", goodsColorList);
			map.put("goodsSizeList", goodsSizeList);
		}
		return map;
	}

	@Override
	public ResultVo findGoodsByLevel(Integer goodsLevel) {
		// TODO Auto-generated method stub
		return ResultVo.setOK(goodsDao.findGoodsByLevel(goodsLevel));
	}

	@Override
	public Map<String, Object> selectAllGoodsById(Integer GoodsId) {
		Map<String, Object> map = new HashMap<String, Object>();
		Goods goods = goodsDao.selectAllGoodsById(GoodsId);
		List<List<GoodsColor>> goodsColorList = new ArrayList<List<GoodsColor>>();
		List<List<GoodsSize>> goodsSizeList = new ArrayList<List<GoodsSize>>();
		List<GoodsColor> goodsColors = goodsColorDao.selectAllGoodsColorsByGoodsId(goods.getGoodsId());
		List<GoodsSize> goodsSizes = goodsSizeDao.selectGoodsSizeAllById(goods.getGoodsId());
		goodsColorList.add(goodsColors);
		goodsSizeList.add(goodsSizes);
		map.put("goods", goods);
		map.put("goodsColorList", goodsColorList);
		map.put("goodsSizeList", goodsSizeList);
		
		return map;
	}

	

}
