package com.qitong.dao;

import com.qitong.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //修改一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(@Param("bookID") int id);
    //查询所有书
    List<Books> queryAllBook();

}
