package com.yuv.springHibernateAndAOP.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yuv.springHibernateAndAOP.aspects.AspectMethod;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.yuv")
public class JavaConfig {

	@Bean
	AspectMethod aspect() {
		return new AspectMethod();
	}

}
