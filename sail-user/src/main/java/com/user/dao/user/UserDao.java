package com.user.dao.user;

import com.user.entity.User;

public interface UserDao {
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User queryById(int id);

}
