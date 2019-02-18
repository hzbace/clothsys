package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.GoodsColor;

public interface GoodsColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsColor record);

    int insertSelective(GoodsColor record);

    GoodsColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsColor record);

    int updateByPrimaryKey(GoodsColor record);
    
    List<GoodsColor> selectAllGoodsColorsByGoodsId(Integer GoodsId);
}