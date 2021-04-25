package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

public class SelectUsersByIdCacheOneTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.selectUsersById(1);
        /*sqlSession.clearCache();
        如果在第二次查询前,清空缓存池,就需要执行两次select了*/
        //另外,在两次select语句之间,如果有执行DML操作的话,会自动清理缓存,第二条就需要重新执行select的
        Users users1 = usersMapper.selectUsersById(1);
        System.out.println(users);
        System.out.println(users1);
        //控制台里面只有一条查询语句，第二条是从缓存里面取到的
    }
}
