package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

public class SelectUsersByIdCacheTwoTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.selectUsersById(1);
        System.out.println(users);
        Mybatisutils.closeSqlSession();

        System.out.println("--------------------");

        SqlSession sqlSession1 = Mybatisutils.getSqlSession();
        UsersMapper usersMapper1 = sqlSession1.getMapper(UsersMapper.class);
        Users users1 = usersMapper1.selectUsersById(1);
        System.out.println(users1);
    }
}
