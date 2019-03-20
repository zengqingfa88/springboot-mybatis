package com.zengqingfa.dao;

/*
 *  @ author  zengqingfa
 *  @ created in    2018/12/16  20:43
 *
 */

import com.zengqingfa.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();

    User findById(Integer id);
}
