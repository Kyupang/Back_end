package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	@Autowired
	MemberDAO dao;

	@RequestMapping("movie")
	//input을 name으로 넘겨줬으면 name으로 받으면 된다. 
	public String movie(String movie) {
		System.out.println("브라우저로부터 전달받은 값은" + movie);
		
		if(movie.equals("드라마")) {
			return "drama";
		}else if(movie.equals("코믹")) {
			return "comic";
		}else {
			return "action";
		}
	}

}
