package com.order.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.order.entity.Order;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public Object test(HttpServletRequest req) /*throws BusinessException*/ {
		
		Order order = new Order();
		order.setId(1);
		order.setName("name1");
		
		return order;
	}
	
}
