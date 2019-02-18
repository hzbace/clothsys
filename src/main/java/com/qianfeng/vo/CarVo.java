package com.qianfeng.vo;

import com.qianfeng.pojo.Goods;
import com.qianfeng.pojo.User;

public class CarVo {

	private Integer id;
	private User user;
	private Goods goods;
	private Integer count;
	private String goodsColor;
    private String goodsSize;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Goods getGoods() {
		return goods;
	}
	public String getGoodsColor() {
		return goodsColor;
	}
	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}
