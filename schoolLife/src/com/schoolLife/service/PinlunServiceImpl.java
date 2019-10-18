package com.schoolLife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.PinlunDao;
import com.schoolLife.pojo.Pinlun;

@Service
public class PinlunServiceImpl implements PinlunService {
   @Autowired
   private PinlunDao pinlunDao;

@Override
public void addPL(Pinlun pinlun) {
	pinlunDao.addPL(pinlun);
	
}

@Override
public List<Pinlun> listPL() {
	
	return pinlunDao.listPL();
}
}
