package com.schoolLife.service;

import java.util.List;


import com.schoolLife.pojo.Star;

public interface StarService {
   //添加
	public void addStar(Star star);
   //定时查询
	public List<Star> selectByStarTime(String starTitle);
	//删除
	public void deleteStar(Integer starId);
}
