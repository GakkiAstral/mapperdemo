package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectUsersMapParamTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("keyname","bjsxt");
        map.put("keysex","male");
        List<Users> list = usersMapper.selectUsersMapParam(map);
        list.forEach(System.out::println);
        Mybatisutils.closeSqlSession();
    }
}
