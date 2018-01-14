package com.taotao.manager.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.taotao.manager.entity.TbItem;

/**
 * 商品服务
 * @author xiangzuotao
 * @date 2018年1月14日 下午2:14:09
 * @version
 */
public interface ItemService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(ItemService.class);

	/**
	 * 根据商品id查询商品
	 * @param itemId
	 * @return
	 */
	public TbItem getItemById(Long itemId);
}
