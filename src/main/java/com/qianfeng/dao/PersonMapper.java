package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer perId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer perId);

    Person selectByUserId(Integer perUserId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    List<Person> findAllPerson();
    
    int count();
    
    List<Person> findByName(String perName);
    
    @Select("select max(per_id) from db_person")
    @ResultType(Integer.class)
    int getMaxPerId();
}