package com.yuv.constructorInjectionAsCSchema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
				"com/yuv/constructorInjectionAsCSchema/employeeConfig.xml");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
	}

}
