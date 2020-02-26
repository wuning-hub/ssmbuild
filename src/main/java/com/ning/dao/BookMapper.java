package com.ning.dao;

import com.ning.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //更新一本书
    int updateBooks(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //根据id查询
    Books queryBook(@Param("bookId") int id);

    //查询全部的书
    List<Books> queryAllBook();
}
