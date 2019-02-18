package com.qianfeng.pojo;

public class GoodsColor {
    private Integer id;

    private String color;

    private Integer goodsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

	@Override
	public String toString() {
		return "GoodsColor [id=" + id + ", color=" + color + ", goodsId=" + goodsId + "]";
	}
    
    
}