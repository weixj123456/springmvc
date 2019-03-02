package com.jsx.dao;

import com.jsx.model.Require;

public interface RequireMapper {
    int delete(Integer id);
    int insert(Require record);
    int insert1(Require record);
    Require select(Integer id);
    int update(Require record);
    int updateById(Require record);
}