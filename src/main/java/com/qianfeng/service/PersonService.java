package com.qianfeng.service;

import com.qianfeng.pojo.Person;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

public interface PersonService {

	public ResultVo save(Person person);
	
	public PageBeanVo<Person> findAllPerson();
	
	public ResultVo deleteById(Integer id);
	
	ResultVo findPerById(Integer id);
	
	ResultVo update(Person perosn);
	
	ResultVo findByName(String perName);
	
	ResultVo insertSelective(Person record);
	
	int getMaxId();
}
