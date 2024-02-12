package com.yuv.springLifecycleMethodUsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Initializing method");

	}

	@PostConstruct
	public void afterPropertiesSet() {
		System.out.println("Destruction method");

	}

}
