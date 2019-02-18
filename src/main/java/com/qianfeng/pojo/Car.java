package com.qianfeng.pojo;

public class Car {
    private Integer carId;

    private Integer carUserId;

    private Integer carGoodsId;

    private Integer carGoodsCount;

    private String carGoodsColor;

    private String carGoodsSize;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarUserId() {
        return carUserId;
    }

    public void setCarUserId(Integer carUserId) {
        this.carUserId = carUserId;
    }

    public Integer getCarGoodsId() {
        return carGoodsId;
    }

    public void setCarGoodsId(Integer carGoodsId) {
        this.carGoodsId = carGoodsId;
    }

    public Integer getCarGoodsCount() {
        return carGoodsCount;
    }

    public void setCarGoodsCount(Integer carGoodsCount) {
        this.carGoodsCount = carGoodsCount;
    }

    public String getCarGoodsColor() {
        return carGoodsColor;
    }

    public void setCarGoodsColor(String carGoodsColor) {
        this.carGoodsColor = carGoodsColor == null ? null : carGoodsColor.trim();
    }

    public String getCarGoodsSize() {
        return carGoodsSize;
    }

    public void setCarGoodsSize(String carGoodsSize) {
        this.carGoodsSize = carGoodsSize == null ? null : carGoodsSize.trim();
    }
}