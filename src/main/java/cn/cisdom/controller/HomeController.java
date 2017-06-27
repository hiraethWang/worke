package cn.cisdom.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cisdom.pojo.Student;

@Controller
public class HomeController {

	@RequestMapping(value="/index/{id}",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
	@ResponseBody
	public Student home(@PathVariable String id,Model model){
		Student s = new Student();
		s.setClazz("1");
		s.setName("zhangsan");
		s.setId(id);
		return s;
	}
	
}
