package com.qianfeng.pojo;

public class User {
    @Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", uroleId="
				+ uroleId + ", userFlag=" + userFlag + "]";
	}

	private Integer userId;

    private String userName;

    private String userPassword;

    private Integer uroleId;

    private Integer userFlag;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

  

    public Integer getUroleId() {
		return uroleId;
	}

	public void setUroleId(Integer uroleId) {
		this.uroleId = uroleId;
	}

	public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }
    
    
}