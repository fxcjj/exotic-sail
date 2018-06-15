package com.user.error;

public enum CommonErrorCode implements ErrorCode {
	
	SYSTEM_BUSY(1000, "系统繁忙，请稍后再试");
	
	private int code;

	private String msg;

	CommonErrorCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}
	
}
