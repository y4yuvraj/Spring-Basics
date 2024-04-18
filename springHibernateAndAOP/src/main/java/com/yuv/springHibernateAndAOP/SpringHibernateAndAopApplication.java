package com.yuv.springHibernateAndAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yuv.springHibernateAndAOP.entity.Person;
import com.yuv.springHibernateAndAOP.service.PersonServiceImpl;

@SpringBootApplication
public class SpringHibernateAndAopApplication implements CommandLineRunner {

	@Autowired
	PersonServiceImpl service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateAndAopApplication.class, args);
	}

	@Override
	public void run(String... args) {
		
		Person person=new Person(101,"yuv","singh");
		
		try {
			Person save = service.save(person);
			System.out.println(save);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
