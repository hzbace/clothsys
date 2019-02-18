package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByGoods(Goods record);

    int updateByPrimaryKey(Goods record);
    
    public List<Goods> findAllGoods();
    
    public List<Goods> findGoods(Goods goods);
    
    List<Goods> selectByPid(Integer goodsPid);
    
    List<Goods> selectAllGoodsByType();
    
    List<Goods> selectAllGoodsByPage(Integer page);
    
    Goods selectAllGoodsById(Integer GoodsId);

    List<Goods> selectAllGoodsPriceByType();
    
    List<Goods> selectAllGoodsSalesByType();
    
    List<Goods> findGoodsByLevel(Integer goodsLevel);
    
}