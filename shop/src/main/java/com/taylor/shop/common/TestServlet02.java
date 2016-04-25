package com.taylor.shop.common;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet02 extends HttpServlet {

  private static final long serialVersionUID = -6187807555027868446L;

  public void init(ServletConfig config) {
    System.out.println("+++++++++++++++++++++++++++++++++++++++" + this.getClass().getName() + "+++++++++++++++++++++++++++++++++++++++");
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("test02进来了");

  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    this.doPost(request, response);

  }
}
