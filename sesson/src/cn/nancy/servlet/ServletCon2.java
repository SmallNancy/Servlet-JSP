package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCon2
 */
@WebServlet(name = "context2", urlPatterns = { "/context2" })
public class ServletCon2 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
  		throws ServletException, IOException {
  	ServletContext sc = this.getServletContext();
  	//获取数据
  	System.out.println(sc.getAttribute("str"));
  }
}
