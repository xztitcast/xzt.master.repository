package com.taotao.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.manager.entity.TbItem;
import com.taotao.manager.service.ItemService;

/**
 * 商品控制器
 * @author xiangzuotao
 * @date 2018年1月14日 下午8:43:33
 * @version
 */
@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	/**
	 * 获取商品
	 * @param itemId
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/item/{itemId}")
	public TbItem getItemById(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}
}
