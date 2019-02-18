package com.qianfeng.pojo;

public class GoodsSize {
    private Integer id;

    private String goodsSize;

    private Integer goodsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize == null ? null : goodsSize.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

	@Override
	public String toString() {
		return "GoodsSize [id=" + id + ", goodsSize=" + goodsSize + ", goodsId=" + goodsId + "]";
	}
    
    
}