package cn.cisdom.mapper;

import cn.cisdom.pojo.RuKu;

public interface RuKuMapper {
    int deleteByPrimaryKey(Integer cRukuId);

    int insert(RuKu record);

    int insertSelective(RuKu record);

    RuKu selectByPrimaryKey(Integer cRukuId);

    int updateByPrimaryKeySelective(RuKu record);

    int updateByPrimaryKey(RuKu record);
}