package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {
	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	@RequestMapping("insert2.gyu")
	public void insert(BbsVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update.gyu")
	public void update(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete3.gyu")
	public String delete(int no) {
		System.out.println(no);
		int result = dao.delete(no);
		System.out.println("내가 결과:"+result);
		if(result ==1) {
			return "redirect:ajax_test.jsp";
		}else {
			return "delete3";
		}
	}
	
	@RequestMapping("one2.gyu")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag",bag);
		
		
		ArrayList<ReplyVO>list =dao2.list(no);
		model.addAttribute("list", list);
	}
	
	
	
	
	
	
	
	
	
	//views 를 안쓰고 json으로 받을것임 
	@RequestMapping("one22.gyu")
	@ResponseBody
	//리턴값인 백 데이터를 json으로 만들어서 클라이언트로 전송
	//클라이언트 브라우저에서는 success: function(x) 
	//결과 함수의 입력변수인 x로 쏙 들어간다. 
	public BbsVO one22(int no) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		System.out.println(bag);
		return bag;
	}
	
	@RequestMapping("list55.gyu")
	@ResponseBody
	public ArrayList<BbsVO> list5() {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("list2.gyu")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5.gyu")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	@RequestMapping("one3.gyu")
	public void one3(int no, Model model) {
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag2",bag);
	}
		
	
	
	
}