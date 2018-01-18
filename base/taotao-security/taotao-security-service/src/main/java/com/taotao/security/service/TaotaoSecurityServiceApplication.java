package com.taotao.security.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.taotao.common.utils.SpringApplicationContext;

/**
 * 权限启动入口
 * @author xiangzuotao
 * @date 2018年1月16日 下午8:16:50
 * @version
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:dubbo/*.xml"})
@EnableJpaRepositories(basePackages = {"com.taotao.security.repository"})
@MapperScan(basePackages = {"com.taotao.security.mapper"})
@EntityScan(basePackages = {"com.taotao.security.entity"})
public class TaotaoSecurityServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TaotaoSecurityServiceApplication.class, args); 
		SpringApplicationContext.setApplicationContext(context);
	}

}
