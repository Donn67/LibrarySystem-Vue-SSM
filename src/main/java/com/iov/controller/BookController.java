package com.iov.controller;

import com.iov.domain.Book;
import com.iov.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {

        boolean flag = bookService.save(book);
        return new Result(flag,flag?Code.SAVE_OK.getCode():Code.SAVE_ERR.getCode());
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean success = bookService.update(book);
        if (success) {
            return new Result(null, Code.UPDATE_OK.getCode(), "更新成功");
        } else {
            return new Result(null, Code.UPDATE_ERR.getCode(), "更新失败");
        }
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        boolean success = bookService.delete(id);
        if (success) {
            return new Result(null, Code.DELETE_OK.getCode(), "删除成功");
        } else {
            return new Result(null, Code.DELETE_ERR.getCode(), "删除失败");
        }
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id) {
        return new Result(bookService.getById(id),Code.GET_OK.getCode(),null);

    }

    @GetMapping
    public Result getAll() {
        return new Result(bookService.getAll(),Code.GET_OK.getCode(),null);

    }
}
