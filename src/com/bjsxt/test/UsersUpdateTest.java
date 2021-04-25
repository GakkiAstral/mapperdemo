package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

public class UsersUpdateTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("oldlu");
        users.setUsersex("female");
        users.setUserid(2);
        usersMapper.usersUpdate(users);
        sqlSession.commit();
        Mybatisutils.closeSqlSession();

    }
}

