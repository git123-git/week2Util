package com.zhangxiaohui.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringController {
	@RequestMapping("toAdd.do")
	public String toAdd() {//ҳ����ת����
		return "add";//��ת��add
	}
	
	@RequestMapping("add.do")
	@ResponseBody//ע��
	public int add() {//��ӷ���
		
		return 1;
	}

}
