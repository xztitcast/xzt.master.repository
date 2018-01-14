package com.taotao.manager.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.taotao.common.utils.SpringApplicationContext;

/**
 * 商城管理服务入口
 * @author xiangzuotao
 * @date 2018年1月14日 下午2:06:17
 * @version
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/*.xml"})
@EnableJpaRepositories(basePackages = {"com.taotao.manager.repository"})
@MapperScan(basePackages = {"com.taotao.manager.mapper"})
@EntityScan(basePackages = {"com.taotao.manager.entity"})
public class TaotaoManagerServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TaotaoManagerServiceApplication.class, args);
		SpringApplicationContext.setApplicationContext(context);
	}

}
