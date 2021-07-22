package com.guosen.demo.serviceImpl;

import com.guosen.demo.service.UserService;

import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class UserServiceImpl implements UserService {
    @Override
   public String login(String name,String password){
       return "hello:"+name+password;
   }
}