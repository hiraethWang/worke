package cn.cisdom.mapper;

import cn.cisdom.pojo.ShuXing;

public interface ShuXingMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(ShuXing record);

    int insertSelective(ShuXing record);

    ShuXing selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(ShuXing record);

    int updateByPrimaryKey(ShuXing record);
}