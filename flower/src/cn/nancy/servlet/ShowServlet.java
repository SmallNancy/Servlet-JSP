package cn.nancy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.nancy.pojo.Flower;
import cn.nancy.service.FlowerService;
import cn.nancy.service.impl.FlowerServiceImpl;
@WebServlet("/show")
public class ShowServlet extends HttpServlet{
	private FlowerService flowerServise = new FlowerServiceImpl();
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Flower> list = flowerServise.show();
    req.setAttribute("list", list);
    req.getRequestDispatcher("index.jsp").forward(req, resp);
  }
}
