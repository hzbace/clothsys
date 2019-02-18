package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.PersonMapper;
import com.qianfeng.pojo.Person;
import com.qianfeng.service.PersonService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public ResultVo save(Person person) {
		// TODO Auto-generated method stub
		
		if (personMapper.insertSelective(person) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public PageBeanVo<Person> findAllPerson() {
		// TODO Auto-generated method stub
		PageBeanVo<Person> vo = new PageBeanVo<>();
		
		List<Person> list = personMapper.findAllPerson();
		vo.setCode(1);
		vo.setCount(personMapper.count());
		vo.setMsg("");
		vo.setData(list);
		return vo;
	}

	@Override
	public ResultVo deleteById(Integer id) {
		// TODO Auto-generated method stub
		if (personMapper.deleteByPrimaryKey(id) > 0) {
			return ResultVo.setOK(null);
		}else{
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo findPerById(Integer id) {
		// TODO Auto-generated method stub
		Person person = personMapper.selectByPrimaryKey(id);
		if (person != null) {
			return ResultVo.setOK(person);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo update(Person perosn) {
		// TODO Auto-generated method stub
		if (personMapper.updateByPrimaryKeySelective(perosn) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo findByName(String perName) {
		// TODO Auto-generated method stub
		List<Person> list = personMapper.findByName(perName);
		if (list != null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	}
	
	@Override
	public ResultVo insertSelective(Person record) {
		// TODO Auto-generated method stub
		if (personMapper.insertSelective(record)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
		
	}

	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		return personMapper.getMaxPerId();
	}


}
