package com.schooLif.mapper;

import java.util.List;

import com.schoolLife.pojo.Star;

public interface StarDao {
	//Ìí¼Ó
   public void addStar(Star star);
   
   //²éÑ¯
   public List<Star> selectByStarTime(String starTitle);
   
   //É¾³ý
   public void deleteStar(Integer starId);
}
