package com.yuv.springHibernateAndAOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectMethod {

	//we will call aspect method on our service class methods
	
	 @Before("execution(public * com.yuv.springHibernateAndAOP.service.PersonService.save(..))")
	    public void beforeSave(JoinPoint joinPoint) {
	        System.out.println("Running before the save method");
	    }
	 
	 @After("execution(public * com.yuv.springHibernateAndAOP.service.PersonService.save(..))")
	 public void afterSave(JoinPoint joinPoint)
	 {
		 System.out.println("after the save method");
	 }
	 
	
}
 