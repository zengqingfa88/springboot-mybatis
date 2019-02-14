package com.zengqingfa.controller;

/*
 *  @ author  zengqingfa
 *  @ created in    2018/12/16  20:50
 *
 */

import com.zengqingfa.dao.UserMapper;
import com.zengqingfa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUserList")
    public List<User>  queryUserList(){
        System.out.println("8888888888888");
		System.out.println("springframework1111");
		System.out.println("test--commit");
        System.out.println("test-idea-commit");
        System.out.println("test-idea-test分支");
        return  userMapper.queryUserList();      
    }

}
