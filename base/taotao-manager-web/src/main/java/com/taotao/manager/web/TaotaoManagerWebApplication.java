package com.taotao.manager.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 商城管理表现层入口
 * @author xiangzuotao
 * @date 2018年1月14日 下午2:04:39
 * @version
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/*.xml"})
public class TaotaoManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoManagerWebApplication.class, args);
	}

}
