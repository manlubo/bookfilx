package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Member;
import lombok.extern.slf4j.Slf4j;
import service.MemberService;

@Slf4j
@WebServlet("/member/login")
public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =	req.getParameter("id");
		String pw = req.getParameter("pw");
		
		log.info(id);
		MemberService service = new MemberService();
		
		if(service.login(id, pw)) {
			HttpSession session = req.getSession();
			session.setAttribute("member", service.findById(id));
			resp.sendRedirect(req.getContextPath() + "/index");
		}
		else {
			
			resp.sendRedirect("login?msg=fail");
		}
			
	}
	
	
}
