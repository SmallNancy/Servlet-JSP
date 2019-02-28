package cn.nancy.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext
 *     实现不同用户数据共享 
 * @author Nancy
 *
 */
@WebServlet(name = "context", urlPatterns = { "/context" })
public class ServletCon extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//1、获取ServletContext对象
		ServletContext sc = this.getServletContext();   //a方法
		ServletContext sc1 = this.getServletConfig().getServletContext();  //b方法
		ServletContext sc2 = req.getSession().getServletContext();   //c方法
		//2、存储数据
		sc.setAttribute("str", "welcom");
	}

}
