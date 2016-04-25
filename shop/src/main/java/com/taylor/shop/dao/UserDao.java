package com.taylor.shop.dao;

import com.taylor.shop.entity.User;
import com.taylor.shop.vo.UserVo;

public interface UserDao extends BaseDao<User> {

  public UserVo queryUserVo(UserVo userVo);

}
