package com.yuv.springHibernateAndAOP.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuv.springHibernateAndAOP.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
