package com.multi.ocrtest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RestController {
	@Autowired
	MapDAO dao;
	
	
	@RequestMapping("jsonResponse5")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public MapVO kakaoMap() {
		MapVO bag = new MapVO();
		bag.setLat(33.450701);
		bag.setLon(126.570667);
		
		
		dao.insert(bag);
		System.out.println(bag);
		return bag;
	}
	
	
}
