package com.atguigu.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.springboot.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

	@Autowired
	private Person person;
	
	@Autowired
	private ApplicationContext ioc;
	
	@Test
	public void contextLoads() {
		
		System.out.println("person:"+person);
		boolean b = ioc.containsBean("helloService");
		System.out.println("b:"+b);
	}

}
