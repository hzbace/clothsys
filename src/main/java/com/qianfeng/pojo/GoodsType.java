package com.qianfeng.pojo;

public class GoodsType {
    private Integer gtId;

    private String gtName;

    private Integer gtKind;

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName == null ? null : gtName.trim();
    }

    public Integer getGtKind() {
        return gtKind;
    }

    public void setGtKind(Integer gtKind) {
        this.gtKind = gtKind;
    }

	@Override
	public String toString() {
		return "GoodsType [gtId=" + gtId + ", gtName=" + gtName + ", gtKind=" + gtKind + "]";
	}
    
}