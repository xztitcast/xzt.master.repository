package com.taotao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.manager.entity.TbItem;
import com.taotao.manager.repository.TbItemRepository;
import com.taotao.manager.service.ItemService;

/**
 * 商品服务实现
 * @author xiangzuotao
 * @date 2018年1月14日 下午4:48:29
 * @version
 */
@Service("itemService")
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemRepository itemRepository;
	
	@Override
	public TbItem getItemById(Long itemId) {
		TbItem tbItem = itemRepository.findOne(itemId);
		LOGGER.error("ERROR级别日志打印成功");
		return tbItem;
	}

}
