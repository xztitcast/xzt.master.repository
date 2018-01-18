package com.taotao.sso.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 单点登录入口
 * @author xiangzuotao
 * @date 2018年1月16日 下午8:29:41
 * @version
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/*.xml"})
@EnableJpaRepositories(basePackages = {"com.taotao.manager.repository"})
@MapperScan(basePackages = {"com.taotao.manager.mapper"})
@EntityScan(basePackages = {"com.taotao.sso.entity"})
public class TaotaoSsoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoSsoServiceApplication.class, args);
	}

}
