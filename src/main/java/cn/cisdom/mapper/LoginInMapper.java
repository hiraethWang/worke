package cn.cisdom.mapper;

import cn.cisdom.pojo.LoginIn;

public interface LoginInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginIn record);

    int insertSelective(LoginIn record);

    LoginIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginIn record);

    int updateByPrimaryKey(LoginIn record);
}