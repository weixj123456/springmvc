package com.jsx.dao;

import com.jsx.model.Idcard;

public interface IdcardMapper {
    int deleteById(Integer id);

    int insert(Idcard record);

    int insertSelect(Idcard record);

    Idcard selectById(Integer id);

    int updateBySelect(Idcard record);

    int updateById(Idcard record);
}