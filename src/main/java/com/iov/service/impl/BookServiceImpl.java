package com.iov.service.impl;

import com.iov.domain.Book;
import com.iov.mapper.BookMapper;
import com.iov.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service

public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        return bookMapper.save(book)>0;

    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
