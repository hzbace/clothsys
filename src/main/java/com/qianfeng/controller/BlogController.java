package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.service.BlogService;
import com.qianfeng.vo.ResultVo;

@Controller
public class BlogController {
	@Autowired
	private BlogService service;
	
	@RequestMapping("/findAllBlog.do")
	@ResponseBody
	public ResultVo findAllBlog() {
		return service.selectAllBlog();
	}
	
	@RequestMapping("/findBlogByUser.do")
	@ResponseBody
	public ResultVo findBlogByUser(String userName) {
		return service.selectByUser(userName);
	}
	
	@RequestMapping("/findBlogById.do")
	@ResponseBody
	public ResultVo findBlogById(Integer blogUserId) {
		return service.selectById(blogUserId);
	}
	
	@RequestMapping("/updateShare.do")
	@ResponseBody
	public ResultVo updateShare(Integer shareNum , Integer blogId) {
		return service.updateShare(shareNum, blogId);
	}
	
	@RequestMapping("/selectByBlogId.do")
	@ResponseBody
	public ResultVo selectByBlogId(Integer blogId) {
		return service.selectByBlogId(blogId);
	}
	
	
}
