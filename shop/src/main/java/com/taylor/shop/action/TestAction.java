package com.taylor.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taylor.shop.entity.TestBean;


@RequestMapping("/test/*")
@Controller
public class TestAction {
  @Autowired
  private TestBean testBean;

  @Value("#{testBean.email}")
  private String email;

  @RequestMapping("test")
  public String test(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
    map.put("email", testBean.getEmail());
    return "index";
  }
}
