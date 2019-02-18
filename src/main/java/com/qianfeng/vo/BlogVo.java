package com.qianfeng.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BlogVo {

	private Integer blogId;

	private String blogPicture;

	private Integer commentNum;

	private String commentContent;

	private Integer blogUserId;

	private Integer shareNum;

	private String commentItem;

	private Date blogTime;
	
	

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogPicture() {
		return blogPicture;
	}

	public void setBlogPicture(String blogPicture) {
		this.blogPicture = blogPicture;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Integer getBlogUserId() {
		return blogUserId;
	}

	public void setBlogUserId(Integer blogUserId) {
		this.blogUserId = blogUserId;
	}

	public Integer getShareNum() {
		return shareNum;
	}

	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}

	public String getCommentItem() {
		return commentItem;
	}

	public void setCommentItem(String commentItem) {
		this.commentItem = commentItem;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	public Date getBlogTime() {
		return blogTime;
	}

	public void setBlogTime(Date blogTime) {
		this.blogTime = blogTime;
	}

	public String getBlogStyle() {
		return blogStyle;
	}

	public void setBlogStyle(String blogStyle) {
		this.blogStyle = blogStyle;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

	private String blogStyle;
	
	private String userName;
	 
	private Integer userFlag;


}
