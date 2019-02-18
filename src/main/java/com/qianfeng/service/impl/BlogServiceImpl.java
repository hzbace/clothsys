package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.BlogMapper;
import com.qianfeng.service.BlogService;
import com.qianfeng.vo.BlogVo;
import com.qianfeng.vo.ResultVo;
@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogMapper dao;
	@Override
	public ResultVo selectAllBlog() {
		// TODO Auto-generated method stub
		List<BlogVo> list = dao.selectAllBlog();
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	
	}

	@Override
	public ResultVo selectByUser(String userName) {
		// TODO Auto-generated method stub
		List<BlogVo> list = dao.selectByUser(userName);
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo selectById(Integer blogUserId) {
		// TODO Auto-generated method stub
		List<BlogVo> list = dao.selectById(blogUserId);
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo updateShare(Integer shareNum,Integer blogId) {
		// TODO Auto-generated method stub
		BlogVo blogVo = new BlogVo();
		blogVo.setShareNum(shareNum);
		blogVo.setBlogId(blogId);
		if (dao.updateShare(blogVo)>0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
		
		
	}

	@Override
	public ResultVo selectByBlogId(Integer blogId) {
		// TODO Auto-generated method stub
		
		List<BlogVo> list = dao.selectByBlogId(blogId);
		if (list!=null) {
			return ResultVo.setOK(list);
		}else {
			return ResultVo.setERROR();
		}
	}
	
}
