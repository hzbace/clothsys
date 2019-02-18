package com.qianfeng.controller;

import java.util.Collection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.vo.ResultVo;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	 
	@PostMapping("login.do")
	@ResponseBody
	public ResultVo UserLogin(String userName, String userPassword) {
		ResultVo resultVo = userService.login(userName, userPassword);
		if (resultVo.getCode() == 1) {
			//shiro完成登录认证
			Subject subject = SecurityUtils.getSubject();
			//2.设置登陆的Token
			UsernamePasswordToken token = new UsernamePasswordToken(userName, userPassword);
			//3.存储数据到session
			subject.getSession().setAttribute(userName, resultVo.getData());
			//4.登录认证
			subject.login(token);
		}
		return resultVo;
	}
	
	@GetMapping("getUserId.do")
	@ResponseBody
	public ResultVo getUserId() {
		Subject subject = SecurityUtils.getSubject();
		Collection<Object> keys = subject.getSession().getAttributeKeys();
		User user = new User();
		if (!keys.isEmpty() && keys.size() != 0) {
			for (Object key : keys) {
				User user2 = (User) subject.getSession().getAttribute(key);
				user.setUserId(user2.getUserId());
				user.setUserName(user2.getUserName());
				return ResultVo.setOK(user);
			}
		}
		return ResultVo.setERROR();
	}
	
	@PostMapping("addUser.do")
	@ResponseBody
	public ResultVo AddUser(User user) {
		ResultVo resultVo = userService.insertSelective(user);
		return resultVo;
	}
	
	@RequestMapping("/getAllUser.do")
	@ResponseBody
	public ResultVo findAll() {
		ResultVo resultVo = userService.findAll();
		return resultVo;
	}
	
	@RequestMapping("/updateUser.do")
	@ResponseBody
	public ResultVo updateUser(Integer userId) {
		ResultVo resultVo = userService.updateUser(userId);
		return resultVo;
	}
	
	@RequestMapping("/updateByUser.do")
	@ResponseBody
	public ResultVo updateByUser(String userPassword) {
		User user = new User();
		user.setUserPassword(userPassword);
		ResultVo resultVo = userService.updateByUser(user);
		return resultVo;
	}
	
	@RequestMapping("/selectUsers.do")
	@ResponseBody
	public ResultVo selectUsers(String userName, Integer uroleId) {
		
		ResultVo resultVo = userService.selectUsers(userName, uroleId);
		return resultVo;
	}
	
	@RequestMapping("/updateBackUser.do")
	@ResponseBody
	public ResultVo updateBackUser(Integer userId) {
		ResultVo resultVo = userService.updateBackUser(userId);
		return resultVo;
	}
	
}
