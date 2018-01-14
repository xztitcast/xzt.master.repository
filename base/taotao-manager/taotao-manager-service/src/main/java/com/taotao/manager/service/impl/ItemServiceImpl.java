package com.taotao.manager.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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


}
