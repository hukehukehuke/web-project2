package com.schoolLife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.DianzanDao;
import com.schoolLife.pojo.Dianzan;

@Service
public class DianzanServiceImpl implements DianzanService{
    @Autowired
    private DianzanDao dianzanDao;
    
    public DianzanDao getDianzanDao() {
		return dianzanDao;
	}

	public void setDianzanDao(DianzanDao dianzanDao) {
		this.dianzanDao = dianzanDao;
	}

	//添加
	public void addDainzan(Dianzan dianzan) {
	
		dianzanDao.addDainzan(dianzan);
	}
    //删除取消点赞
	
	public int deletePriKeyDz(String id) {
		
		return dianzanDao.deletePriKeyDz(id);
	}
	//查找用户是否点赞
		
	public Dianzan chakanDz(Dianzan dianzan) {
		
		return dianzanDao.chakanDz(dianzan);
	}
	
      
}
