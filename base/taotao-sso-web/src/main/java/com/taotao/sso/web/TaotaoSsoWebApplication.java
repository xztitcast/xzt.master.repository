package com.taotao.sso.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 单点登录控制层入口
 * @author xiangzuotao
 * @date 2018年1月16日 下午8:39:31
 * @version
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/*.xml"})
public class TaotaoSsoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoSsoWebApplication.class, args);
	}

}
