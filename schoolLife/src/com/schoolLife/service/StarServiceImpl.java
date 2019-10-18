package com.schoolLife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.StarDao;
import com.schoolLife.pojo.Star;
@Service
public class StarServiceImpl  implements StarService {
	
	@Autowired
	private StarDao starDao;
	
    public StarDao getStarDao() {
		return starDao;
	}

	public void setStarDao(StarDao starDao) {
		this.starDao = starDao;
	}

	//Ìí¼Ó
	@Override
	public void addStar(Star star) {		
		starDao.addStar(star);
	}
	//²éÑ¯
	@Override
	public List<Star> selectByStarTime(String starTitle) {
		// TODO Auto-generated method stub
		return starDao.selectByStarTime(starTitle);
	}
   //É¾³ý
	@Override
	public void deleteStar(Integer starId) {
		starDao.deleteStar(starId);
		
	}

   
	

}
