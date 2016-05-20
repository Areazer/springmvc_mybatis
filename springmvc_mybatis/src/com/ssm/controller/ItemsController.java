package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Items;
import com.ssm.pojo.ItemsCustom;
import com.ssm.service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;

	// ��Ʒ��ѯ
	@RequestMapping(value="/queryItems")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception {
	

		System.out.println(request.getParameter("id"));

		// ����service���� ���ݿ⣬��ѯ��Ʒ�б�
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);
		
		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList", itemsList);

		// ָ����ͼ
		// �±ߵ�·�����������ͼ������������jsp·����ǰ׺��jsp·���ĺ�׺���޸�Ϊ
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// �ϱߵ�·�����ÿ��Բ��ڳ�����ָ��jsp·����ǰ׺��jsp·���ĺ�׺
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
				
				
			}

	
	
	
	
	
	
	
}
