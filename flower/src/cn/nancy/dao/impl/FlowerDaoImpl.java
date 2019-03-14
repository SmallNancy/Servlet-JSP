package cn.nancy.dao.impl;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import cn.nancy.dao.FlowerDao;
import cn.nancy.pojo.Flower;

public class FlowerDaoImpl implements FlowerDao{
  List<Flower> list = new ArrayList<Flower>();
  java.sql.Connection conn = null;
  PreparedStatement ps = null;
  ResultSet rs = null;
	@Override
	public List<Flower> selectAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
				 ps = conn.prepareStatement("select * from flower");
				 rs = ps.executeQuery();
				 while(rs.next()) {
					 list.add(new Flower(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4)));
				 }
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
