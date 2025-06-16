package controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Member;
import lombok.extern.slf4j.Slf4j;
import service.MemberService;

@Slf4j
@WebServlet("/member/register")
public class Register extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/register.jsp").forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =	req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String tel = req.getParameter("tel");
		
		log.info(id);
		MemberService service = new MemberService();
		
		if(id == null || service.findById(id) != null || pw == null || name == null) {
			resp.setContentType("text/html; charset=utf-8");
			PrintWriter writer = resp.getWriter();
			writer.print("<script>");
			writer.print("alert('아이디, 비밀번호, 이름이 비어있거나 중복된 아이디입니다.');");
			writer.print("location.href = 'register'");
			writer.print("</script>");
			return;
		}
		
		Member member = Member.builder().id(id).pw(pw).name(name).email(email).tel(tel).build();
		service.register(member);
		
		resp.sendRedirect("/bookflix/index");
	}
	
	
}
