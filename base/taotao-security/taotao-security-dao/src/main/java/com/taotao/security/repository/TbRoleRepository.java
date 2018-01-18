package com.taotao.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taotao.security.entity.TbRole;

/**
 * 角色持久层
 * @author xiangzuotao
 * @date 2018年1月16日 下午10:09:38
 * @version
 */
public interface TbRoleRepository extends JpaRepository<TbRole, Long> {

	/**
	 * 根据用户id查询所有角色
	 * @param id
	 * @return
	 */
	public List<TbRole> findByUserId(Long id);

}
