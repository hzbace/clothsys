package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Person;
import com.qianfeng.service.PersonService;
import com.qianfeng.vo.PageBeanVo;
import com.qianfeng.vo.ResultVo;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/AllPerson.do")
	@ResponseBody
	public PageBeanVo<Person> findAllPerson(){
		
		return personService.findAllPerson();
	}
	
	
	@RequestMapping("/removePerson.do")
	@ResponseBody
	public ResultVo remove(Integer id) {
		
		return personService.deleteById(id);
	}
	
	@RequestMapping("/findPerson.do")
	@ResponseBody
	public ResultVo findPerson(Integer id) {
		
		return personService.findPerById(id);
	}
	
	@RequestMapping("/updatePerson.do")
	@ResponseBody
	public ResultVo update(Person p) {
		return personService.update(p);
	}
	
	@RequestMapping("/findByName.do")
	@ResponseBody
	public ResultVo findByName(String perName) {
		return personService.findByName(perName);
	}
	
	@RequestMapping("/insertPerson.do")
	@ResponseBody
	public ResultVo insertSelective(Person person) {
		return personService.insertSelective(person);
	}
}
