package noConfigWithProperties;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan would have been added but we are using @bean so not required
@PropertySource("noConfigWithProperties/emp.properties")
public class JavaConfig {
	
	@Value("${id}")
	int empId;
	@Value("${name}")
	String empName;
	
	@Bean
	public Employee getEmployee() {
		Employee emp = new Employee(getAddress(),getWork()); //constructor injection
		emp.setId(empId);
		emp.setName(empName);
		return emp;
	}
	
//	@Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

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



}
