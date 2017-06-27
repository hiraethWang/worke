package cn.cisdom.service;

import cn.cisdom.pojo.Name;


public interface NameService {
	String selectUserByID(String user) throws Exception; //查询 密码
	int insertUser(Name name) throws Exception;
}
