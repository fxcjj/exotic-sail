package com.user.error;

/**
 * 错误码
 * @author Victor
 * @date 2018年5月22日 下午7:14:09
 */
public interface ErrorCode {
	
	/**
	 * 获取错误码
	 * @return 返回错误码
	 */
	int getCode();
	
	/**
	 * 获取错误信息
	 * @return 返回错误信息
	 */
	String getMsg();
	
}
