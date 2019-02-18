package com.qianfeng.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class orderVo {
	private Integer orderId;
	private Integer orderPaytype;
	private Integer userId;
	private String userName;
	private Integer orderPerId;
	private Integer orderPrice;
	private Integer orderCarId;
	private Integer orderStatus;
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date orderDate;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderPaytype() {
		return orderPaytype;
	}
	public void setOrderPaytype(Integer orderPaytype) {
		this.orderPaytype = orderPaytype;
	}
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
		this.userName = userName;
	}
	public Integer getOrderPerId() {
		return orderPerId;
	}
	public void setOrderPerId(Integer orderPerId) {
		this.orderPerId = orderPerId;
	}
	public Integer getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Integer getOrderCarId() {
		return orderCarId;
	}
	public void setOrderCarId(Integer orderCarId) {
		this.orderCarId = orderCarId;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "orderVo [orderId=" + orderId + ", orderPaytype=" + orderPaytype + ", userId=" + userId + ", userName="
				+ userName + ", orderPerId=" + orderPerId + ", orderPrice=" + orderPrice + ", orderCarId=" + orderCarId
				+ ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}
	
}
