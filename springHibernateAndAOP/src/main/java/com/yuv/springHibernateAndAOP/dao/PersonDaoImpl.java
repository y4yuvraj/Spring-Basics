package com.yuv.springHibernateAndAOP.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuv.springHibernateAndAOP.entity.Person;
import com.yuv.springHibernateAndAOP.repo.PersonRepo;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	PersonRepo repo;

	@Override
	public Person create(Person person) {
		return repo.save(person);
	}

}
