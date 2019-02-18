package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer gtId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer gtId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
    
    List<GoodsType> selectByKind(Integer gtKind);
    
    List<GoodsType> selectAll();
}