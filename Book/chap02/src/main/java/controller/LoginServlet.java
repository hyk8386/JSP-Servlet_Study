package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메서드 호출");
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메서드 호출");
		doHandle(request, response);

	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		System.out.println("doHandle 메서드 호출");
		
		String user_id = request.getParameter("user_id");   // 괄호안은 html에 있는거 호출
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		
		System.out.println("아이디 : " + user_id);      // 진짜로 값을 받았는지 확인하는 작업
		System.out.println("비밀번호 : " + user_pw);
		System.out.println("주소 : " + user_address);
		
		response.setContentType("text/html; charset=utf-8");  // 웹에서 띄울때
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("당신이 입력한 정보입니다.<br>");
		out.print("이름: ");
		out.print(user_id);
		out.print("<br>비밀번호: ");
		out.print(user_pw);
		out.print("<br>주소: ");
		out.print(user_address);
		out.print("<br><a href='javascript:history.go(-1)'>다시</a>");  // 이전 페이지
		out.print("</body></html>");
		
		out.close();
	}
}
