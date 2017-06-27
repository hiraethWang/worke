package cn.cisdom.mapper;

import cn.cisdom.pojo.Name;


public interface Login {
	//登入
	String selectUserByID(String user);
	//注册
	int insertUser(Name name);
}
