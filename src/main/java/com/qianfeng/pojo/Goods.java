package com.qianfeng.pojo;

import java.math.BigDecimal;

public class Goods {
  

	private Integer goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private Integer goodsSize;

    private Integer goodsColor;

    private Integer goodsPid;

    private Integer goodsSales;

    private Integer goodsLevel;

    private Integer goodsHomeId;

    private String goodsImgpath;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(Integer goodsSize) {
        this.goodsSize = goodsSize;
    }

    public Integer getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(Integer goodsColor) {
        this.goodsColor = goodsColor;
    }

    public Integer getGoodsPid() {
        return goodsPid;
    }

    public void setGoodsPid(Integer goodsPid) {
        this.goodsPid = goodsPid;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Integer getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Integer goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public Integer getGoodsHomeId() {
        return goodsHomeId;
    }

    public void setGoodsHomeId(Integer goodsHomeId) {
        this.goodsHomeId = goodsHomeId;
    }

    public String getGoodsImgpath() {
        return goodsImgpath;
    }

    public void setGoodsImgpath(String goodsImgpath) {
        this.goodsImgpath = goodsImgpath == null ? null : goodsImgpath.trim();
    }
    
    @Override
  	public String toString() {
  		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", goodsSize="
  				+ goodsSize + ", goodsColor=" + goodsColor + ", goodsPid=" + goodsPid + ", goodsSales=" + goodsSales
  				+ ", goodsLevel=" + goodsLevel + ", goodsHomeId=" + goodsHomeId + ", goodsImgpath=" + goodsImgpath
  				+ "]";
  	}
}