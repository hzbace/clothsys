package com.qianfeng.vo;

public class ResultVo {

	private Integer code;
	
	private String msg;
	
	private Object data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResultVo setOK(Object data) {
		ResultVo rvo = new ResultVo();
		rvo.setCode(1);
		rvo.setMsg("ok");
		rvo.setData(data);
		return rvo;
	}
	
	public static ResultVo setERROR(String mag) {
		ResultVo rvo = new ResultVo();
		rvo.setCode(0);
		rvo.setMsg(mag);
		
		return rvo;
	}
	
	public static ResultVo setERROR() {
		ResultVo rvo = new ResultVo();
		rvo.setCode(0);
		rvo.setMsg("error");
		
		return rvo;
	}
	

}
