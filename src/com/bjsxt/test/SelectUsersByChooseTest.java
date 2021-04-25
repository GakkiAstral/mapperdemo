package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectUsersByChooseTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("itbz-sxt3");
        users.setUsersex("male");
        //多选一，只执行第一个，后面再有也不添加到条件里
        List<Users> list = usersMapper.selectUsersByChoose(users);
        list.forEach(System.out::println);
    }
}
