package com.taylor.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taylor.shop.service.UserService;
import com.taylor.shop.vo.UserVo;

@Controller
@RequestMapping("/user/*")
public class UserAction {

  @Autowired
  private UserService userService;

  @RequestMapping("user_info")
  public String queryUserInfo(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
    UserVo searchvo = new UserVo();
    searchvo.setId(1);
    UserVo userVo = userService.queryUser(searchvo);
    map.put("userVo", userVo);
    return "user/user_info";
  }
}
