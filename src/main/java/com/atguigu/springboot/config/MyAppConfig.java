package com.atguigu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.springboot.service.HelloService;

@Configuration
public class MyAppConfig {

	
	@Bean
	public HelloService helloService(){
		
		System.out.println("给容器中添加组件了。。。。。。");
		return new HelloService();
	}
}
