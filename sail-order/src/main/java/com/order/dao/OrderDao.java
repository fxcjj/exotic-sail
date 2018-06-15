package com.order.dao;

import com.order.entity.Order;

public interface OrderDao {
	
	Order queryById(int id);
	
}