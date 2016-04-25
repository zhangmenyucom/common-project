package com.taylor.shop.common;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet01 extends HttpServlet {

  private static final long serialVersionUID = -3798603307445163601L;

  public void init(ServletConfig config) {
    System.out.println("+++++++++++++++++++++++++++++++++++++++" + this.getClass().getName() + "+++++++++++++++++++++++++++++++++++++++");
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    System.out.println("test01进来了");
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    this.doPost(request, response);

  }
}
