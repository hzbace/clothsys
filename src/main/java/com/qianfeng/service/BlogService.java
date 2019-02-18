package com.qianfeng.service;



import com.qianfeng.vo.ResultVo;

public interface BlogService {
	 ResultVo selectAllBlog();
	    
	 ResultVo selectByUser(String userName);
	 
	 ResultVo selectById(Integer blogUserId);
	 
	 ResultVo updateShare(Integer shareNum, Integer blogId);
	 
	 ResultVo selectByBlogId(Integer blogId);

}
