package com.iov.mapper;

import com.iov.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface BookMapper {
    @Insert("insert into books(type, name, description) values(#{type}, #{name}, #{description})")
    int save(Book book);
    @Update("update books " +
            "set type=#{type},name=#{name},description=#{description} " +
            "where id=#{id}")
    int update(Book book);

    @Delete("delete from books where id=#{id}")
    int delete(Integer id);
    @Select("select * from books  where id=#{id}")
    Book getById(Integer id);
    @Select("select * from books order by id")
    List<Book> getAll();

}
