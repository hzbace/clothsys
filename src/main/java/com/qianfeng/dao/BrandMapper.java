package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.Brand;

public interface BrandMapper {

	@Select("select * from db_brand")
	@ResultType(Brand.class)
	List<Brand> findAll();
}
