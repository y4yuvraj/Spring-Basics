package com.yuv.springProperties;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/yuv/springProperties/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.registerShutdownHook();
	}

}
