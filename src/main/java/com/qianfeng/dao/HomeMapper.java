package com.qianfeng.dao;

import com.qianfeng.pojo.Home;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer homeId);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer homeId);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
}