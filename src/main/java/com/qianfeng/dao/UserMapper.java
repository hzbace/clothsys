package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);
    
    User selectByPrimaryKey(Integer userId);
    //修改指定用户信息
    int updateByUser(User record);

    int updateByPrimaryKey(User record);
    
    User findUser(String userName);
    //展示用户信息
    public List<User> findAll();
    //删除指定用户
    public int updateUser(Integer userId);
    
    //模糊查询
    public List<User> selectUsers(User user);
    //还原指定用户
    public int updateBackUser(Integer userId);
    
    
    
}