package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class selectUsersByIdUseArrayTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        int[] arr = new int[]{1,2};
        List<Users> users = usersMapper.selectUsersByIdUseArray(arr);
        users.forEach(System.out::println);
    }
}
