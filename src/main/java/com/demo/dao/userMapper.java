package com.demo.dao;

import com.demo.entity.user;
import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(Long id);

    int insert(user record);

    user selectByPrimaryKey(Long id);

    List<user> selectAll();

    int updateByPrimaryKey(user record);
}