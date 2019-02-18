package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Blog;
import com.qianfeng.vo.BlogVo;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
    
    List<BlogVo> selectAllBlog();
    
    List<BlogVo> selectByUser(String userName);
    
    List<BlogVo> selectById(Integer blogUserId);
    
    int updateShare(BlogVo blogVo);
    
    List<BlogVo> selectByBlogId(Integer blogId);
     
}