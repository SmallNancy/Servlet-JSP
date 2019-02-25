package cn.nancy.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * request 由tomcat服务器创建
 * q  作用：封存了当前请求的所有请求信息
 * @author Nancy
 *
 */
@WebServlet(name = "methond", urlPatterns = { "/methond" })
public class ServletMethond extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
  		throws ServletException, IOException {
  	System.out.println("service ---");
  	String methond = req.getMethod();      // 获取请求信息
  	System.out.println(methond);
  	StringBuffer sb = req.getRequestURL(); // 获取URL
  	System.out.println("获取URL:" + sb);
  	String uri = req.getRequestURI();      // 获取URI
  	System.out.println("获取协议:" + uri);
  	String s = req.getScheme();            // 获取协议
  	System.out.println(s);
  	
   //a 获取用户数据
  	String name = req.getParameter("uname");
  	String pwd = req.getParameter("pwd");
  	System.out.println(name + ":" +pwd);
  	
  	Enumeration<String> euns = req.getParameterNames();
  	
  	// 设置响应编码格式
  	//resp.setHeader("content-type", "text/html;charset=utf-8");
  	resp.setContentType("text/html;charset=utf-8");
  	resp.getWriter().write("<b>登陆成功</b>");
  	
  }
}
