package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class insertUsersBatchTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> list = new ArrayList<>();
        Users users = new Users();
        users.setUsername("itbz-sxt6");
        users.setUsersex("male");
        Users users1 = new Users();
        users1.setUsername("itbz-sxt7");
        users1.setUsersex("male");
        list.add(users);
        list.add(users1);
        int flag = usersMapper.insertUsersBatch(list);
        sqlSession.commit();
        System.out.println(flag);
        Mybatisutils.closeSqlSession();
    }
}
