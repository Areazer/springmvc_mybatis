package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.ItemsMapper;
import com.ssm.mapper.ItemsMapperCustom;
import com.ssm.pojo.Items;
import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsQueryVo;
import com.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	ItemsMapper itemsMapper;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemsById(int id) throws Exception {
		Items items = itemsMapper.selectByPrimaryKey(id);
		ItemsCustom itemsCustom = new ItemsCustom();
		
		BeanUtils.copyProperties(items, itemsCustom);
		
		return null;
			
	}

	@Override
	public void updateItems(int id, ItemsCustom itemsCustom) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
