package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    List<Users> selectUsersAll();
    Users selectUsersById(int userid);
    List<Users> selectUsersOrderParam(String username,String usersex);
    List<Users> selectUsersAnnParam(@Param("name") String username,@Param("sex") String usersex);
    List<Users> selectUsersPOJOParam(Users users);
    List<Users> selectUsersMapParam(Map<String,String> map);
    List<Users> selectUsers(int userid);
    List<Users> selectUsersRowBounds(RowBounds rowBounds);
    List<Users> selectUsersLimit(@Param("offset") int offset,@Param("limit") int limit);
    int insertUsers(Users users);
    void insertUsersGetKey(Users users);
    void insertUsersGetKey2(Users users);
    List<Users> selectUsersByProperty(Users users);
    List<Users> selectUsersByChoose(Users users);
    List<Users> selectUsersByPropertyWhere(Users users);
    List<Users> selectUsersByLikeName(String name);
    void usersUpdate(Users users);
    List<Users> selectUsersByIdUseCollection(List<Integer> list);
    List<Users> selectUsersByIdUseArray(int[] arr);
    int selectUsersCount(@Param("suibian") Map<String,String> map);
    int insertUsersBatch(List<Users> list);
}
