package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.edas.carshop.itemcenter.Item;
import com.alibaba.edas.carshop.itemcenter.ItemService;

@Controller
@RequestMapping("hsf")
public class TestController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/queryItem",method=RequestMethod.GET)
	@ResponseBody
	public Object queryItem(String name) {
		System.out.println("name="+name);
		Item item = itemService.getItemByName(name);
		System.out.println("item");
		return item;
	}
}
