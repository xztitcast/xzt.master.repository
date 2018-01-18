package com.taotao.security.entity;

import javax.persistence.*;

/**
 * 角色
 * @author xiangzuotao
 * @date 2018年1月16日 下午8:53:57
 * @version
 */
@Entity
@Table(name = "tb_role")
public class TbRole {
	
	private Long id;
	
	private String name;
	
	private Long userId;

	@Id
	@Column(name = "id", nullable =  false, columnDefinition = "bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, columnDefinition = "varchar(20) NOT NULL COMMENT '角色名称'")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "user_id", nullable = false, columnDefinition="bigint(20) NOT NULL COMMENT '用户id'")
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
