package com.schoolLife.service;

import com.schoolLife.pojo.Dianzan;

public interface DianzanService {
	 //添加保存点赞
	public void addDainzan(Dianzan dianzan);
    //删除取消点赞
	public int deletePriKeyDz(String id);
	//查找用户是否点赞
	public Dianzan chakanDz(Dianzan dianzan);
}
