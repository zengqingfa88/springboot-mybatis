package com.zengqingfa.controller;

/*
 *  @ author  zengqingfa
 *  @ created in    2018/12/16  20:50
 *
 */

import com.zengqingfa.dao.UserMapper;
import com.zengqingfa.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUserList")
    public List<User> queryUserList() {
        System.out.println("8888888888888");
        System.out.println("springframework1111");
        System.out.println("test--commit");
        System.out.println("test-idea-commit");
        System.out.println("test-idea-test分支");
        return userMapper.queryUserList();
    }

    @RequestMapping("/findById")
    public User findById(Integer id, String cardId) {
        System.out.println("8888888888888");
        System.out.println("springframework1111");
        System.out.println("test--commit");
        System.out.println("test-idea-commit");
        System.out.println("test-idea-test分支");
        return userMapper.findById(id);
    }


    @PostMapping("/findById2")
    public List<User> findById2(@RequestParam(value = "ids[]") Integer[] ids) {
        System.out.println("8888888888888");
        System.out.println("springframework1111");
        System.out.println("test--commit");
        System.out.println("test-idea-commit");
        System.out.println("test-idea-test分支");
        List<User> list = new ArrayList<User>();
        User user = null;
        for (int i = 0; i < ids.length; i++) {
            user = userMapper.findById(i);
            list.add(user);
        }
        return list;
    }

    @PostMapping("/findById3")
    public List<User> findById3(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("8888888888888");
        System.out.println("springframework1111");
        System.out.println("test--commit");
        System.out.println("test-idea-commit");
        System.out.println("test-idea-test分支");
        List<User> list = new ArrayList<User>();
        String id = request.getParameter("id");
        System.out.println(id);
        User user = null;

        return list;
    }

}
