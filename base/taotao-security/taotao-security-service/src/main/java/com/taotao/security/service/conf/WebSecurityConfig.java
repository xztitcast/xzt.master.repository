package com.taotao.security.service.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.taotao.security.service.CustomUserService;

/**
 * web权限配置
 * @author xiangzuotao
 * @date 2018年1月16日 下午9:56:05
 * @version
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserService customUserService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/users/**")
			.authenticated()
            .antMatchers(HttpMethod.POST)
            .authenticated()
            .antMatchers(HttpMethod.PUT)
            .authenticated()
            .antMatchers(HttpMethod.DELETE)
            .authenticated()
            .antMatchers("/**")
            .permitAll()
            .and()
            .sessionManagement()
            .and()
            .httpBasic();
	}
	
}
