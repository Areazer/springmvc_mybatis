package com.ssm.mapper;

import com.ssm.pojo.Items;
import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsExample;
import com.ssm.pojo.ItemsQueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
	//��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}