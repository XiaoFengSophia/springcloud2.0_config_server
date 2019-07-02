package com.zxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AppCofigServer {

	//@EnableConfigServer  开启config server
	/**
	 * 如何把我们的配置文价存放到git环境上
	 *1、在git环境上创建文件规范
	 *   服务名-环境.properties
	 *   
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppCofigServer.class, args);
	}

}
