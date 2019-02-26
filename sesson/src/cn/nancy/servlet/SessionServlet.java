package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * session����
 *   
 * @author Nancy
 *
 */
@WebServlet(name = "ss", urlPatterns = { "/ss" })
public class SessionServlet extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO ������������ʽ
	 req.setCharacterEncoding("utf-8");
	 resp.setContentType("text/html;charset=utf-8");
	 String name = "nancy";
	 //��������ȡsession����
	 HttpSession hs = req.getSession();
	 System.out.println(hs.getId());
	 //�洢����
	 hs.setAttribute("name", name);
	 resp.getWriter().write("session ѧϰ");
  }
}
