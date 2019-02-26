package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *  session 存储在服务器端
 * @author Nancy
 *
 */
@WebServlet(name = "ss2", urlPatterns = { "/ss2" })
public class SessionTest2 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
  		throws ServletException, IOException {
  	HttpSession hs = req.getSession();
  	//hs.setMaxInactiveInterval(3600 * 24);设置存储时间
  	System.out.println("SessionTest2:" + hs.getId());
  	System.out.println(hs.getAttribute("name"));;
  }
}
