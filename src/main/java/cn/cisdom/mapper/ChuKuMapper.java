package cn.cisdom.mapper;

import cn.cisdom.pojo.ChuKu;

public interface ChuKuMapper {
    int deleteByPrimaryKey(Integer cChukuId);

    int insert(ChuKu record);

    int insertSelective(ChuKu record);

    ChuKu selectByPrimaryKey(Integer cChukuId);

    int updateByPrimaryKeySelective(ChuKu record);

    int updateByPrimaryKey(ChuKu record);
}