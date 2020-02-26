package com.ning.service;

import com.ning.dao.BookMapper;
import com.ning.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //Service 调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public Books queryBook(int id) {
        return bookMapper.queryBook(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
