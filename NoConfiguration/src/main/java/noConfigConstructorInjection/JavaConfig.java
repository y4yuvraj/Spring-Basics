package noConfigConstructorInjection;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan would have been added but we are using @bean so not required
public class JavaConfig {

	@Bean(name = "address")
	public Address getAddress() {
		Address address = new Address();
		address.setCity("doon");
		address.setHouseNo(101);
		address.setState("UK");
		return address;
	}

	@Bean(name = "work1")
	public ArrayList<String> getWork() {
		ArrayList<String> work = new ArrayList<>();
		work.add("spring1");
		work.add("security1");
		work.add("angular1");
		return work;
	}
	
	@Bean(name = "work2")
	public ArrayList<String> getWork2() {
		ArrayList<String> work = new ArrayList<>();
		work.add("spring2");
		work.add("security2");
		work.add("angular2");
		return work;
	}

	@Bean
	public Employee getEmployee() {
		Employee emp = new Employee(getAddress(),getWork()); //constructor injection
		emp.setId(1); //setter injection
		emp.setName("yuv"); //setter injection
		return emp;
	}

}
