package com.taotao.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.security.entity.TbRole;
import com.taotao.security.entity.TbUser;
import com.taotao.security.repository.TbRoleRepository;
import com.taotao.security.repository.TbUserRepository;
import com.taotao.security.service.CustomUserService;

@Service("customUserService")
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, readOnly = true)
public class CustomUserServiceImpl implements CustomUserService {
	
	@Autowired
	private TbUserRepository userRepository;
	
	@Autowired
	private TbRoleRepository roleRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TbUser tbUser = userRepository.findByUsername(username);
		if(tbUser == null) {
			throw new UsernameNotFoundException("用户名不存在 username = " + username);
		}
		List<SimpleGrantedAuthority> authorList = new ArrayList<>();
		List<TbRole> roleList = roleRepository.findByUserId(tbUser.getId());
		roleList.forEach(
				tbRole -> authorList.add(new SimpleGrantedAuthority(tbRole.getName()))
		);
		tbUser.setAuthorities(authorList);
		return tbUser;
	}

}
