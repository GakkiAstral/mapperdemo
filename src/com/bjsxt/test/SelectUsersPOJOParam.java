package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectUsersPOJOParam {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("bjsxt");
        users.setUsersex("male");
        List<Users> list = usersMapper.selectUsersPOJOParam(users);
        list.forEach(System.out::println);
        Mybatisutils.closeSqlSession();
    }
}
