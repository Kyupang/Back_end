package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("json1")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public MemberVO json1(MemberVO bag) {
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}
	
	@RequestMapping("json2")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root12");
		bag2.setPw("1234123");
		bag2.setName("hong13");
		bag2.setTel("01113");
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
	
	
	@RequestMapping("jsonResponse5")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public MapVO kakaoMap() {
		MapVO bag = new MapVO();
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		System.out.println(bag);
		return bag;
	}
	
	@RequestMapping("jsonResponse6") 
	//VO-> JASON으로!!!!! 바꾸는 어노테이션 까먹지 말자!!
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public ArrayList<GoogleVO> googleChart() {
		GoogleVO bag = new GoogleVO();
		bag.setWork("교육");
		bag.setPercent(4);
		
		GoogleVO bag2 = new GoogleVO();
		bag2.setWork("자습");
		bag2.setPercent(4);
		
		GoogleVO bag3 = new GoogleVO();
		bag3.setWork("먹기");
		bag3.setPercent(1);
		
		GoogleVO bag4 = new GoogleVO();
		bag4.setWork("잠");
		bag4.setPercent(5);
		
		ArrayList<GoogleVO> list = new ArrayList<GoogleVO>();
		list.add(bag);
		list.add(bag2);
		list.add(bag3);
		list.add(bag4);
		
		return list;
		
		//주소에 경로가 안보이게 하는 방법 
		//@RequestMapping("/dog/{name}")
		//public String dog(@PathVariable String name) {
	}
}
