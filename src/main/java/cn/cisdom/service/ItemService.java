package cn.cisdom.service;

import cn.cisdom.pojo.TbItem;

public interface ItemService {
	
	int insertItemInfo(TbItem tbItem)throws Exception;
	
	int deleteItemInfo(Long id)throws Exception;
	
	int updateItemInfo(TbItem tbItem)throws Exception;
	
	TbItem getItemInfo(Long id);
	
}
