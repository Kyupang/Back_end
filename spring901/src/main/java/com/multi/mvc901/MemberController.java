package com.multi.mvc901;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	MemberDAO dao;
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴 , 정보검색
	
	//클래스 내에서 기능처리 담당 
	//멤버변수 + 멤버메서드 (기능처리 담당)
	//하나의 요청당 하나의 메서드 
	
	//요청된 주소가 어떻게 될 때 
	//바로 아래에 있는 메서드가 호출이 될지 써주어야함
	@RequestMapping("insert.gyu")
	public void insert(MemberVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	}
	@RequestMapping("update.gyu")
	public void update(MemberVO bag) {
		dao.update(bag);
		System.out.println(bag);
		System.out.println(dao);
	}
	@RequestMapping("delete.gyu")
	public void delete(String id) {
		dao.delete(id);
	}

	@RequestMapping("one.gyu")
	public void one(MemberVO vo, Model model) {
		MemberVO one = dao.select_one(vo);
		model.addAttribute("one",one);
	}	
	@RequestMapping("list.gyu")
	public void list( Model model) {
		List<MemberVO> list =dao.list();
		model.addAttribute("list",list);
	}
//
//	@RequestMapping("login.gyu")
//	public String login(MemberVO bag, HttpSession session) {
//		int result = dao.login(bag);
//		if(result ==1) {
//			//로그인 성공하면, 세션을 잡아두자.!!
//			session.setAttribute("userid", bag.getId());
//			return "ok";
//		}else {
//			//views 아래가 아니고, webapp 아래
//			//member.jsp로 가고 싶은 경우!
//			return "redirect:member.jsp";
//		}
//	}

}
