package setterInjection;

import java.util.ArrayList;

public class Employee {
	
	private int id;
	private String name;
	private ArrayList<String> work;
	private Address address;
	
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
