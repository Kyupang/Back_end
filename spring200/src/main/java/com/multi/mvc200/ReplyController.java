package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("insert4")
	public void insert(ReplyVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}
	
	@RequestMapping("list6.gyu")
	public void list6(int bbsno, Model model) {
		System.out.println(bbsno);
		ArrayList<ReplyVO> list = dao.list(bbsno);
		model.addAttribute("list", list);
	}
}
