package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * session技术
 *   
 * @author Nancy
 *
 */
@WebServlet(name = "ss", urlPatterns = { "/ss" })
public class SessionServlet extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO 设置请求编码格式
	 req.setCharacterEncoding("utf-8");
	 resp.setContentType("text/html;charset=utf-8");
	 String name = "nancy";
	 //创建并获取session对象
	 HttpSession hs = req.getSession();
	 System.out.println(hs.getId());
	 //存储数据
	 hs.setAttribute("name", name);
	 resp.getWriter().write("session 学习");
  }
}
