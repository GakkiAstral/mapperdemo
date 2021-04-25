package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectUsersByPropertyWhereTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        //users.setUsersex("MALE");
        users.setUsername("sxt");
        List<Users> list = usersMapper.selectUsersByPropertyWhere(users);
        list.forEach(System.out::println);
    }
}
