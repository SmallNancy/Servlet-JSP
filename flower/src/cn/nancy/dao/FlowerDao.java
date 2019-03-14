package cn.nancy.dao;

import java.util.List;

import cn.nancy.pojo.Flower;

public interface FlowerDao {
  List<Flower> selectAll();
}
