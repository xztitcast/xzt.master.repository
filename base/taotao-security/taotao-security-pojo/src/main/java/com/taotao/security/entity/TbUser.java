package com.taotao.security.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 用户对应的角色
 * @author xiangzuotao
 * @date 2018年1月16日 下午8:54:03
 * @version
 */
@Entity
@Table(name = "tb_user")
public class TbUser implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String username;
	
	private String password;
	
	private  List<? extends GrantedAuthority> authorities;
	
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Transient
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(List<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "password", nullable = false, columnDefinition = "varchar(30) NOT NULL COMMENT '密码'")
	@Override
	public String getPassword() {
		return password;
	}

	@Column(name = "username", nullable = false, columnDefinition = "varchar(20) NOT NULL COMMENT '用户名'")
	@Override
	public String getUsername() {
		return username;
	}

	@Transient
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Transient
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Transient
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Transient
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
