package com.user.service;

import com.user.entity.User;

/**
 * 用户服务
 * @author Victor
 * @date 2018年5月11日 上午11:19:49
 */
public interface UserService {
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User queryById(int id);
	
}
