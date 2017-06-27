package cn.cisdom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cisdom.mapper.Login;
import cn.cisdom.pojo.Name;
import cn.cisdom.service.NameService;

@Service("NameService")
public class NameServiceImpl implements NameService {
	
	@Autowired
	private Login login;

	@Override
	public String selectUserByID(String user)throws Exception {
		String num = login.selectUserByID(user);
		return num;
	}
	@Override
	public int insertUser(Name name)throws Exception {
		int num = login.insertUser(name);
		return num;
	}


	
	
	
	
}
