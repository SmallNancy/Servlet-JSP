package cn.nancy.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * request ��tomcat����������
 * q  ���ã�����˵�ǰ���������������Ϣ
 * @author Nancy
 *
 */
@WebServlet(name = "methond", urlPatterns = { "/methond" })
public class ServletMethond extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) 
  		throws ServletException, IOException {
  	System.out.println("service ---");
  	String methond = req.getMethod();      // ��ȡ������Ϣ
  	System.out.println(methond);
  	StringBuffer sb = req.getRequestURL(); // ��ȡURL
  	System.out.println("��ȡURL:" + sb);
  	String uri = req.getRequestURI();      // ��ȡURI
  	System.out.println("��ȡЭ��:" + uri);
  	String s = req.getScheme();            // ��ȡЭ��
  	System.out.println(s);
  	
   //a ��ȡ�û�����
  	String name = req.getParameter("uname");
  	String pwd = req.getParameter("pwd");
  	System.out.println(name + ":" +pwd);
  	
  	Enumeration<String> euns = req.getParameterNames();
  	
  	// ������Ӧ�����ʽ
  	//resp.setHeader("content-type", "text/html;charset=utf-8");
  	resp.setContentType("text/html;charset=utf-8");
  	resp.getWriter().write("<b>��½�ɹ�</b>");
  	
  }
}
