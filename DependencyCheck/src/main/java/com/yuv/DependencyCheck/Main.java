package com.yuv.DependencyCheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(
				"com/yuv/DependencyCheck/config.xml");
		Employee e1=(Employee) context.getBean("emp");
		System.out.println(e1);
		
	}

}
