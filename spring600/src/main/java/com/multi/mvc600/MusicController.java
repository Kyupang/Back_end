package com.multi.mvc600;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MusicController {
	@Autowired
	MusicDAO dao;
	
	@RequestMapping("insert3.gyu")
	public void insert(MusicVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update3.gyu")
	public void update(MusicVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete3.gyu")
	public void delete(int no) {
		System.out.println(no);
		int result = dao.delete(no);
	}
	
	@RequestMapping("one3.gyu")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		MusicVO bag = dao.one(no);
		model.addAttribute("bag",bag);	
	}

	
	@RequestMapping("list3.gyu")
	public void list(Model model) {
		List<MusicVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}