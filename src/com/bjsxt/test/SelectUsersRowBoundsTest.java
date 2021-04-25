package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectUsersRowBoundsTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        RowBounds rowBounds = new RowBounds(0,1);
        List<Users> list = usersMapper.selectUsersRowBounds(rowBounds);
        list.forEach(System.out::println);
        Mybatisutils.closeSqlSession();
    }
}
