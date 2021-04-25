package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

public class selectUsersByIdUseCollectionTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Users> users = usersMapper.selectUsersByIdUseCollection(list);
        users.forEach(System.out::println);
    }
}
