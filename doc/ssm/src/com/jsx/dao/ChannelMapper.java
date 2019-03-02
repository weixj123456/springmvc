package com.jsx.dao;

import com.jsx.model.Channel;

public interface ChannelMapper {
    int delete(Integer id);

    int insert(Channel record);

    int insert1(Channel record);

    Channel select(Integer id);

    int update(Channel record);

    int updateById(Channel record);
}