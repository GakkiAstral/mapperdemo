package com.bjsxt.test;

import com.bjsxt.Service.UsersService;
import com.bjsxt.Service.impl.UsersServiceImpl;
import com.bjsxt.pojo.Users;

public class SelectUsersByIdTest {
    public static void main(String[] args) {
        UsersService usersService = new UsersServiceImpl();
        Users users = usersService.findUsersById(1);
        System.out.println(users);
    }
}
