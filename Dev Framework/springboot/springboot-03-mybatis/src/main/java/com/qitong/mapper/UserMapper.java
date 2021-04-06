package com.qitong.mapper;

import com.qitong.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //获取 所有名单
    List<User> getUsers();

    //获取人员根据id
    User getUserById(int id);

    //增加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUserById(int id);

    //修改一个用户
    int updateUser(User user);

}
