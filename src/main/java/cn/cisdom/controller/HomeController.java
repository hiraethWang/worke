package cn.cisdom.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cisdom.pojo.Name;

@Controller
public class HomeController {

	@RequestMapping(value="/index/{id}",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
	@ResponseBody
	public Name home(@PathVariable String id,Model model){
		Name s = new Name();
		s.setMima("1");
		s.setUser("zhangsan");
	
		return s;
	}
	
}
