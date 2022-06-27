package unit09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.javabeans.MemberBean;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet") // 호출하는 주소
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberBean member = new MemberBean("전수빈", "pinksubin");  // MemberBean 클래스에 있는 name, id에 값을 줌
		
		request.setAttribute("member", member);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("el.jsp");
		dispatcher.forward(request, response);
	}
}
