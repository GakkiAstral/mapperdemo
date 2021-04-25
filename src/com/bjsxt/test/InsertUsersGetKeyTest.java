package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

public class InsertUsersGetKeyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("itbz-sxt");
        users.setUsersex("male");
        usersMapper.insertUsersGetKey(users);
        sqlSession.commit();
        System.out.println(users.getUserid());
        Mybatisutils.closeSqlSession();
    }
}
