package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/1.
 */
@RestController
public class HelloWorldController {
  @RequestMapping("/hello")
  public String sd() {
    System.out.println("000");
    return "Hello World";
  }
  @RequestMapping(value = { "/" }, method = { RequestMethod.GET })
  public String ndex() {
    System.out.println("000");
    return "forward:/index.html";
  }

}
