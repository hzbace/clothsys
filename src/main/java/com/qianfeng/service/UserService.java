package com.qianfeng.service;



import com.qianfeng.pojo.User;
import com.qianfeng.vo.ResultVo;

public interface UserService {
	ResultVo login(String userName, String userPassword);
	
	ResultVo insertSelective(User record);
	
	 //展示用户信息
	ResultVo findAll();
    //删除指定用户
	ResultVo updateUser(Integer userId);
    
    //模糊查询
	ResultVo selectUsers(String userName, Integer uroleId);
    
    //修改指定用户信息
	ResultVo updateByUser(User record);
	
	 //还原指定用户
	ResultVo updateBackUser(Integer userId);
}
