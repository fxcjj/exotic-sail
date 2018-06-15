package com.order.entity;

public class Order {
	
	//订单id
	private Integer id;
	
	//订单名称
	private String name;
	/*
	//商品id
	private Integer goodsId;
	
	//订单状态 1未支付 5已支付
	private Integer status;
	
	//用户id
	private Integer userId;
	
	//备注
	private String remark;*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}
	
}
