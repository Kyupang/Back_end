package com.multi.mvc300;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2.gyu")
	public void insert(BbsVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update2.gyu")
	public void update(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2.gyu")
	public void delete(int no) {
		System.out.println(no);
		int result = dao.delete(no);
	}
	
	@RequestMapping("one2.gyu")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag",bag);	
	}

	
	@RequestMapping("list2.gyu")
	public void list(Model model) {
		List<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}