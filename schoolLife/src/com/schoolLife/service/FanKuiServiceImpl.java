package com.schoolLife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.FanKuiDao;
import com.schoolLife.pojo.FanKui;

@Service
public class FanKuiServiceImpl implements FanKuiService {
	@Autowired
	private FanKuiDao fanKuiDao;
	
	@Override
	public void addfanKui(FanKui fanKui) {
		fanKuiDao.addfanKui(fanKui);
		
	}
     
}
