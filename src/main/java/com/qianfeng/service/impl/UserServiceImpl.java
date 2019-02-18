package com.qianfeng.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.UserMapper;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.util.EncryptUtil;
import com.qianfeng.vo.ResultVo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userDao;

	@Override
	public ResultVo login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		User user = userDao.findUser(userName);
		if (user!=null) {
			if (user.getUroleId() == 1) {
				if (Objects.equals(user.getUserPassword(), EncryptUtil.md5Enc(userPassword) )) {
					return ResultVo.setOK(user);
				} else {
					return ResultVo.setERROR("用户密码错误");
				}
			} else {
				return ResultVo.setERROR("用户权限不足");
			}
		} else { 
			return ResultVo.setERROR("没有此账户");
		}
	}

	@Override
	public ResultVo insertSelective(User record) {
		
		// TODO Auto-generated method stub
		record.setUserPassword(EncryptUtil.md5Enc(record.getUserPassword()));
		if (userDao.insertSelective(record)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo findAll() {
		// TODO Auto-generated method stub
		List<User> list = userDao.findAll();
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
		
		
	}

	@Override
	public ResultVo updateUser(Integer userId) {
		// TODO Auto-generated method stub
		if (userDao.updateUser(userId)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
		
	}

	@Override
	public ResultVo selectUsers(String userName, Integer uroleId) {
		ResultVo resultVo = new ResultVo();
		// TODO Auto-generated method stub
		User user = new User();
		if (userName!=null && !userName.equals("")) {
			user.setUserName(userName);
		}
		if (uroleId!=null && uroleId!=0) {
			user.setUroleId(uroleId);
		}
		List<User> list = userDao.selectUsers(user);
		
		return resultVo.setOK(list);
	
		
	}

	@Override
	public ResultVo updateByUser(User record) {
		// TODO Auto-generated method stub
		
		if (userDao.updateByUser(record)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo updateBackUser(Integer userId) {
		// TODO Auto-generated method stub
		if (userDao.updateBackUser(userId)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	



}
