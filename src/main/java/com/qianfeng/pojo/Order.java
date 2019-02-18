package com.qianfeng.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
    private Integer orderId;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date orderDate;

    private Integer orderPaytype;

    private Integer orderUserId;

    private Integer orderPerId;

    private BigDecimal orderPrice;

    private Integer orderCarId;

    private Integer orderStatus;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderPaytype() {
        return orderPaytype;
    }

    public void setOrderPaytype(Integer orderPaytype) {
        this.orderPaytype = orderPaytype;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderPerId() {
        return orderPerId;
    }

    public void setOrderPerId(Integer orderPerId) {
        this.orderPerId = orderPerId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderPaytype=" + orderPaytype
				+ ", orderUserId=" + orderUserId + ", orderPerId=" + orderPerId + ", orderPrice=" + orderPrice
				+ ", orderCarId=" + orderCarId + ", orderStatus=" + orderStatus + "]";
	}
    
}