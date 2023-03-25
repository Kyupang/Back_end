package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet("/check.do")
public class Check extends HttpServlet {
	@Override
	public void init() throws ServletException {
		
		System.out.println("Check 서블릿 객체가 하나 만들어진다.");
	}

	@Override
	public void destroy() {
		System.out.println("Check 서블릿 객체 소멸");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");
		if (today.equals("맑음")) {
			out.print("나가자!");
		} else if (today.equals("흐림")) {
			out.print("코딩");
		} else {
			out.print("그냥 있자.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		String img = "<img src='4.jpg'>";
		if (pass.equals("나는 킹이다.")) {
			out.print("들어오세요");
		} else {
			out.print("냠");
			out.print("들어오지마!" + img);
		}

	}

}
