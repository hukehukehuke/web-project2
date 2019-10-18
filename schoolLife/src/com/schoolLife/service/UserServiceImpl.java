package com.schoolLife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooLif.mapper.UserDao;
import com.schoolLife.pojo.User;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserDao userDao;
  

public UserDao getUserDao() {
	return userDao;
}


public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}


@Override
public void addUser(User user) {
	userDao.addUser(user);
}
}
