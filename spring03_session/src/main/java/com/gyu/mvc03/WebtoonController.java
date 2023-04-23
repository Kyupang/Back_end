package com.gyu.mvc03;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class WebtoonController {
	@Autowired
	WebtoonDAO dao;
	
	@RequestMapping("list.gyu")
	public void list(Model model) {
		ArrayList<WebtoonVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}