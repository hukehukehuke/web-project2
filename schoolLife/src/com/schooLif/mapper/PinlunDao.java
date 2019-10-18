package com.schooLif.mapper;

import java.util.List;

import com.schoolLife.pojo.Pinlun;

public interface PinlunDao {
     //添加评论内容
	
	public void addPL(Pinlun pinlun);
	
	//显示评论信息
	public List<Pinlun> listPL();
}
