package com.yuv.springHibernateAndAOP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuv.springHibernateAndAOP.dao.PersonDao;
import com.yuv.springHibernateAndAOP.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonDao dao;

	@Override
	public Person save(Person person) {
		return dao.create(person);
	}
	
	

}
