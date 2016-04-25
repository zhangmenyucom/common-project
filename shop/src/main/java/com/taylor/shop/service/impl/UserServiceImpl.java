package com.taylor.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taylor.shop.dao.UserDao;
import com.taylor.shop.entity.User;
import com.taylor.shop.service.UserService;
import com.taylor.shop.vo.UserVo;

@Service
public class UserServiceImpl extends BaseServiceImpl<User>implements UserService {
  @Autowired
  private UserDao userDao;

  @Override
  public UserDao getThisDao() {
    return userDao;
  }

  @Override
  public UserVo queryUser(UserVo userVo) {
    return userDao.queryUserVo(userVo);
  }

}
