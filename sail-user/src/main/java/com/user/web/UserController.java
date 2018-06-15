package com.user.web;

import javax.servlet.http.HttpServletRequest;

import com.vic.api.order.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.common.AbstractBaseController;
import com.user.entity.User;
import com.user.service.user.UserService;

/**
 * 用户
 * @author Victor
 * @date 2018年5月11日 上午11:21:54
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractBaseController {

	@Autowired
	private UserService userService;

	/*@Autowired
	private DemoService demoService;*/

	/*@RequestMapping(value = "/rpc")
	@ResponseBody
	public Object test(HttpServletRequest req) throws BusinessException {
		String str = demoService.sayHello("john");
		return str;
	}*/

	@RequestMapping(value = "/queryById")
	@ResponseBody
	public Object queryById(HttpServletRequest req) /*throws BusinessException*/ {
		logger.info("Start queryById method");

		int id = Integer.parseInt(req.getParameter("id"));
		User user = userService.queryById(id);

		logger.info("End queryById method");

		return user;
	}

	/**
	 * 跳转到添加页面
	 */
	@RequestMapping(value = "/addUserUI")
	public String addUserUI(Model model) {
		return "/addUserUI";
	}
	
}
