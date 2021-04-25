package com.bjsxt.test;

import com.bjsxt.Service.UsersService;
import com.bjsxt.Service.impl.UsersServiceImpl;
import com.bjsxt.pojo.Users;

import java.util.List;

public class SelectUsersAllTest {
    public static void main(String[] args) {
        UsersService usersService = new UsersServiceImpl();
        List<Users> list = usersService.findUsersAll();
        //list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
