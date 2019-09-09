package com.zhangxiaohui.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringController {
	@RequestMapping("toAdd.do")
	public String toAdd() {//页面跳转方法
		return "add";//跳转到add
	}
	
	@RequestMapping("add.do")
	@ResponseBody//注解
	public int add() {//添加方法
		
		return 1;
	}

}
