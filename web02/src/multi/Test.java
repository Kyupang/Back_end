package multi;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@ - at, annotation중에 하나이다.
//vkdls754@naver.com : at, ~에
//@override : annotation,표시, 어노테이션
// - 1) override : 지워도 상관없음, 가독성, 확인용 
// - 2) @WebServlet("/Test") : 특정한 처리용도 

//-1 첫번쨰 방법: 어노테이션을 사용.
//-2 두번째 방법: 따로 설정 xml 
//@WebServlet("/Test")
public class Test extends HttpServlet {
	String temp = "";
	
	public void init(ServletConfig config) throws ServletException {
		temp = config.getInitParameter("temp");
		System.out.println(temp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
