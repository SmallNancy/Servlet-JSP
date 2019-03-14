package cn.nancy.service.impl;

import java.util.List;

import cn.nancy.dao.FlowerDao;
import cn.nancy.dao.impl.FlowerDaoImpl;
import cn.nancy.pojo.Flower;
import cn.nancy.service.FlowerService;

public class FlowerServiceImpl implements FlowerService{

	private FlowerDao flowerdao = new FlowerDaoImpl();
	@Override
	public List<Flower> show() {
		return flowerdao.selectAll();
	}

}
