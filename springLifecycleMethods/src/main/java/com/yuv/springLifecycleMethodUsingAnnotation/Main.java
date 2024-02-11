package com.yuv.springLifecycleMethodUsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/yuv/springLifecycleMethodUsingInterface/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.registerShutdownHook();
	}

}
