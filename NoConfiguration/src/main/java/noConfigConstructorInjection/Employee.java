package noConfigConstructorInjection;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Employee {

	private int id;
	private String name;
	private ArrayList<String> work;
	private Address address;

	public Employee() {
		super();
	}

	//this is for constructor injection of address and work in javaConfig class
	public Employee(Address address, ArrayList<String> work) {
		super();
		this.work=work;
		this.address = address;
	}

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

	public ArrayList<String> getWork() {
		return work;
	}

	public void setWork(ArrayList<String> work) {
		this.work = work;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", work=" + work + ", address=" + address + "]";
	}

}
