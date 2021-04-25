package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

public class InsertUsersTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("itbz");
        users.setUsersex("male");
        int flag = usersMapper.insertUsers(users);
        sqlSession.commit();
        System.out.println(flag);
        Mybatisutils.closeSqlSession();
    }
}
