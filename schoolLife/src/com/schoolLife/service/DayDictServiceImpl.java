package com.schoolLife.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schooLif.mapper.DayDictDao;
import com.schoolLife.pojo.Day;

@Service
//@Transactional
public class DayDictServiceImpl implements DayDictService {
      @Autowired
      private DayDictDao dayDictDao;
	
    public DayDictDao getDayDictDao() {
		return dayDictDao;
	}
	public void setDayDictDao(DayDictDao dayDictDao) {
		this.dayDictDao = dayDictDao;
	}
	//当天内容查询
		public List<Day> selectDangTianDayList() {
			
			return dayDictDao.selectDangTianDayList();
		}
	//直接查询
		@Override
		public List<Day> selectDayList() {
			// TODO Auto-generated method stub
			return dayDictDao.selectDayList();
		}
	//查询
	@Override
	public List<Day> selectDayListByDateTime(String teampTime) {		
		return dayDictDao.selectDayListByDateTime(teampTime);
	}
   //添加
	@Override
	public void addDay(Day day) {		
		 dayDictDao.addDay(day);
	}
	//删除
	@Override
	public void deleteDay(Integer id) {
		dayDictDao.deleteDay(id);
		
	}
	
	
}
