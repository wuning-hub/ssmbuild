package com.ning.service;

import com.ning.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Ning
 * @Date:2020/2/26 0026 下午 11:08
 **/
public interface BookService {

    //增加一本书
    int addBook(Books books);

    //更新一本书
    int updateBooks(Books books);

    //删除一本书
    int deleteBookById(int id);

    //根据id查询
    Books queryBook(int id);

    //查询全部的书
    List<Books> queryAllBook();
}
