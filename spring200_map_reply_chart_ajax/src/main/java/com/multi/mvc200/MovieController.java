package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	@RequestMapping("movie")
	public void mov(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("제주도");
		list.add("후쿠오카");
		list.add("미국서부");
		list.add("미국동부");
		model.addAttribute("list", list);
	}
	
}


