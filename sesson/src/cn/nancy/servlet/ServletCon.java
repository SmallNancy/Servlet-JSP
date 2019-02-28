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
 *     ʵ�ֲ�ͬ�û����ݹ��� 
 * @author Nancy
 *
 */
@WebServlet(name = "context", urlPatterns = { "/context" })
public class ServletCon extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//1����ȡServletContext����
		ServletContext sc = this.getServletContext();   //a����
		ServletContext sc1 = this.getServletConfig().getServletContext();  //b����
		ServletContext sc2 = req.getSession().getServletContext();   //c����
		//2���洢����
		sc.setAttribute("str", "welcom");
	}

}
