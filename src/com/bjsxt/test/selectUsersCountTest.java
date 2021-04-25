package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class selectUsersCountTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("username","itbz-sxt4");
        map.put("usersex","male");
        int count = usersMapper.selectUsersCount(map);
        Mybatisutils.closeSqlSession();
    }
}
