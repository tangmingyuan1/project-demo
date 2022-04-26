package com.swagger.mapper;

import com.swagger.entity.Consumerrole;

public interface ConsumerroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consumerrole record);

    int insertSelective(Consumerrole record);

    Consumerrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consumerrole record);

    int updateByPrimaryKey(Consumerrole record);
}