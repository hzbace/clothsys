package com.qianfeng.pojo;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private String blogPicture;

    private Integer commentNum;

    private String commentContent;

    private Integer blogUserId;

    private Integer shareNum;

    private String commentItem;

    private Date blogTime;

    private String blogStyle;

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
        this.blogPicture = blogPicture == null ? null : blogPicture.trim();
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
        this.commentContent = commentContent == null ? null : commentContent.trim();
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
        this.commentItem = commentItem == null ? null : commentItem.trim();
    }

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
        this.blogStyle = blogStyle == null ? null : blogStyle.trim();
    }
}