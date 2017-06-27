package cn.cisdom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cisdom.mapper.TbItemMapper;
import cn.cisdom.pojo.TbItem;
import cn.cisdom.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public int insertItemInfo(TbItem tbItem)throws Exception {
		int num = tbItemMapper.insertSelective(tbItem);
		if(num == 0){
			throw new RuntimeException("insert Exception");
		}
		return num;
	}

	@Override
	public int deleteItemInfo(Long id)throws Exception {
		int num = tbItemMapper.deleteByPrimaryKey(id);
		if(num == 0){
			throw new RuntimeException("delete Exception");
		}
		return num;
	}

	@Override
	public int updateItemInfo(TbItem tbItem)throws Exception {
		int num = tbItemMapper.updateByPrimaryKeySelective(tbItem);
		if(num == 0){
			throw new RuntimeException("update Exception");
		}
		return num;
	}

	@Override
	public TbItem getItemInfo(Long id) {
		// TODO Auto-generated method stub
		return tbItemMapper.selectByPrimaryKey(id);
	}
	
	
	
	
	
}
