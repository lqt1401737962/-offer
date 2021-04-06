package com.qitong.service;

import com.qitong.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(int id);
    //修改一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryAllBooks();
}
