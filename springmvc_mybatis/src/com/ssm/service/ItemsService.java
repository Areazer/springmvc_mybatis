package com.ssm.service;

import java.util.List;

import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsQueryVo;

public interface ItemsService {
	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	//根据id返回产品信息
	public ItemsCustom findItemsById(int id) throws Exception;

	//修改商品信息 
	public void updateItems(int id,ItemsCustom itemsCustom) throws Exception;
	
}
