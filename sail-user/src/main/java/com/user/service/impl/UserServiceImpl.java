package com.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.entity.User;
import com.user.service.UserService;

/**
 * 用户服务实现
 * @author Victor
 * @date 2018年5月11日 下午5:36:03
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User queryById(int id) {
		return userDao.queryById(id);
	}
}
