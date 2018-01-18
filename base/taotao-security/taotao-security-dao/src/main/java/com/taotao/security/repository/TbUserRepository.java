package com.taotao.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taotao.security.entity.TbUser;

/**
 * 用户持久层
 * @author xiangzuotao
 * @date 2018年1月16日 下午10:02:58
 * @version
 */
public interface TbUserRepository extends JpaRepository<TbUser, Long> {

	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	public TbUser findByUsername(String username);

}
