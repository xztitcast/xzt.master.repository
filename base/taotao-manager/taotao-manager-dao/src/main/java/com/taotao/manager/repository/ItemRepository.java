package com.taotao.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taotao.manager.entity.TbItem;

public interface ItemRepository extends JpaRepository<TbItem, Long> {

}
