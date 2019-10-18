package com.schoolLife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.WeiXinDao;
import com.schoolLife.pojo.WeiXin;
@Service
public class WeiXinServiceImpl implements WeiXinService{
   @Autowired
   private WeiXinDao weiXinDao;

@Override
public void addWeiXin(WeiXin weiXin) {
	weiXinDao.addWeiXin(weiXin);
	
}

@Override
public WeiXin chakanWeixin(String openid) {
	
	return weiXinDao.chakanWeixin(openid);
}

@Override
public WeiXin xiugaiWEixin(WeiXin weiXin) {
	
	return weiXinDao.xiugaiWEixin(weiXin);
}  
}
