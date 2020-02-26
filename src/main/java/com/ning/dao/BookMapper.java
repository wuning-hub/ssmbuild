package com.ning.dao;

import com.ning.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author: Ning
 * @Date:2020/2/26 0026 下午 11:08
 **/

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
