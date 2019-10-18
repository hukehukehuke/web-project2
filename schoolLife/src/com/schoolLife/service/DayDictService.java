package com.schoolLife.service;


import java.util.List;

import com.schoolLife.pojo.Day;

public interface DayDictService {
	//当天查询
	public List<Day> selectDangTianDayList();
	//直接查询
	public List<Day>  selectDayList();
	//查询
	public List<Day>  selectDayListByDateTime(String teampTime);
	//添加
	public void addDay(Day day);
	//删除
	public void deleteDay(Integer id);
	
}
