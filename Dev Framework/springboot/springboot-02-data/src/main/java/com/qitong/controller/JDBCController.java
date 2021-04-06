package com.qitong.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jdbc")
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/queryAll")
    public List<Map<String, Object>> queryUser() {
        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    //增加一个用户
    @GetMapping("/add")
    public String addUser() {
        //插入语句，注意时间问题
        String sql = "insert into user (name ,age)" +
                " values ('狂神说','1')";
        jdbcTemplate.update(sql);
        //查询
        return "addOk";
    }

    //删除一个用户
    @GetMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") int id) {
        //插入语句
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql, id);
        //查询
        return "deleteOk";
    }

    //修改一个用户
    @GetMapping("/update/{id}")
    public String updateUserById(@PathVariable("id") int id) {
        String sql = "update  user set name=?, age=? where id=" + id;
        Object[] objects = new Object[2];
        objects[0] = "李小小龙";
        objects[1] = 2;

        jdbcTemplate.update(sql, objects);
        return "updateOK";
    }

}
