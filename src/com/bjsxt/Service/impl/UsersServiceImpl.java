package com.bjsxt.Service.impl;

import com.bjsxt.Service.UsersService;
import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> findUsersAll() {
        List<Users> list = null;
        try{
            SqlSession sqlSession = Mybatisutils.getSqlSession();
            //getMapper方法的作用是根据给定的接口的class对象，生成该接口的接口实现类的代理对象
            UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
            list = usersMapper.selectUsersAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Mybatisutils.closeSqlSession();
        }
        return list;
    }

    /**
     * 实现根据用户ID查询用户
     * @param userid
     * @return
     */
    @Override
    public Users findUsersById(int userid) {
        Users users =null;
        try{
            SqlSession sqlSession = Mybatisutils.getSqlSession();
            UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
            users = mapper.selectUsersById(userid);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Mybatisutils.closeSqlSession();
        }
        return users;
    }
}
