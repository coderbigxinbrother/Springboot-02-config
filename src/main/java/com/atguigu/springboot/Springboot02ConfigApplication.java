package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

//@ImportResource(locations={"classpath:person/person.xml"})
@SpringBootApplication
public class Springboot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02ConfigApplication.class, args);
	}
}
