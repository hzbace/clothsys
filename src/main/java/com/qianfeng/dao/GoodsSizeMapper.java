package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.GoodsSize;

public interface GoodsSizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSize record);

    int insertSelective(GoodsSize record);

    GoodsSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsSize record);

    int updateByPrimaryKey(GoodsSize record);
    
    List<GoodsSize> selectGoodsSizeAllById(Integer GoodsId);
}