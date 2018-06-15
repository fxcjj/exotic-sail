package com.user.exception;

import com.user.error.ErrorCode;

/**
 * 业务异常
 * @author Victor
 * @date 2018年5月22日 下午7:16:36
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -3484824529104011053L;
	
	private int errorCode;
	
	private String message;
	
	public BusinessException() {
		super();
	}
	
	public BusinessException(ErrorCode errorCode) {
		this.errorCode = errorCode.getCode();
		this.message = errorCode.getMsg();
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
}
