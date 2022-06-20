package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<hr>");
		out.println("성별 : <b>");
		out.println(gender);
		out.println("</br><br> 메일 정보 수신 여부 : <b>");
		out.println(chk_mail);
		out.println("</br><br> 가입 인사 : <b><pre>");
		out.println(content);
		
		out.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body></html>");
		out.close();
		
		}
}
