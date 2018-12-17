package com.zengqingfa;

/*
 *  @ author  zengqingfa
 *  @ created in    2018/12/16  22:02
 *
 */


import com.zengqingfa.dao.UserMapper;
import com.zengqingfa.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//指定springboot的引导类
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testMybatis(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }

    }

}
