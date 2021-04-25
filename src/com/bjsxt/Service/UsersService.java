package com.bjsxt.Service;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UsersService {
    List<Users> findUsersAll();
    Users findUsersById(int userid);
}
