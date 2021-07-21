package com.guosen.demo.serviceImpl;

import com.guosen.demo.service.HelloService;

import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
   public String sayHello(String name){
       return "hello:"+name;
   }
}