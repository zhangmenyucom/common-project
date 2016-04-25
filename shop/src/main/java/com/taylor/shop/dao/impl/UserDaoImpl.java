package com.taylor.shop.dao.impl;

import org.springframework.stereotype.Repository;

import com.taylor.shop.dao.UserDao;
import com.taylor.shop.entity.User;
import com.taylor.shop.vo.UserVo;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User>implements UserDao {

  @Override
  public String getDao4MapperPackage() {
    return "mapper.User";
  }

  @Override
  public UserVo queryUserVo(UserVo userVo) {

    return (UserVo) this.selectOne("queryUser", userVo);
  }

}
