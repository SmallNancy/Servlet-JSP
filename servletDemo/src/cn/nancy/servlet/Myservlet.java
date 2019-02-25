package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet(name = "my", urlPatterns = { "/my" })
public class Myservlet extends HttpServlet {
	@Override
		public void init() throws ServletException {
		System.out.println("init ��ʼ��");
		
		}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.getWriter().write("servlet life ");  // ��ҳ��ʾ
		System.out.println("hello life");         // ����̨��ʾ
	}
}
