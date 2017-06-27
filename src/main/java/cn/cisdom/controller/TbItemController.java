package cn.cisdom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cisdom.pojo.TbItem;
import cn.cisdom.service.ItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {

	@Autowired
	private ItemService tbItemService;
	
	@ResponseBody
	@RequestMapping("/info")//接口的URL
	public Object getItemParamList(@RequestParam("id") Long id){
		return tbItemService.getItemInfo(id);
	}
	
	@ResponseBody
	@RequestMapping("/insert")
	public Object insertItemInfo(@ModelAttribute TbItem tbItem) throws Exception{
		
		return tbItemService.insertItemInfo(tbItem);
		
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public Object deleteItemInfo(@RequestParam("id") Long id) throws Exception{
		return tbItemService.deleteItemInfo(id);
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public Object updateItemInfo(@RequestParam("id") Long id){
		return tbItemService.getItemInfo(id);
	}
	
}
