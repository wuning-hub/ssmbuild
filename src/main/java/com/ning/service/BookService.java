package com.ning.service;

import com.ning.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books books);

    //更新一本书
    int updateBooks(Books books);

    //删除一本书
    int deleteBookById( int id);

    //根据id查询
    Books queryBook( int id);

    //查询全部的书
    List<Books> queryAllBook();
}
