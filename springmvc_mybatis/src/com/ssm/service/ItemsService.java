package com.ssm.service;

import java.util.List;

import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsQueryVo;

public interface ItemsService {
	//��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	//����id���ز�Ʒ��Ϣ
	public ItemsCustom findItemsById(int id) throws Exception;

	//�޸���Ʒ��Ϣ 
	public void updateItems(int id,ItemsCustom itemsCustom) throws Exception;
	
}
