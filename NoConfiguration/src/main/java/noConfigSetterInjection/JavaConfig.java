package noConfigSetterInjection;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan would have been added but we are using @bean so not required
public class JavaConfig {
	
	
	@Bean
	public Address getAddress()
	{
		Address address=new Address();
		address.setCity("doon");
		address.setHouseNo(101);
		address.setState("UK");
		return address;
	}
	
	@Bean
	public ArrayList<String> getWork()
	{
		ArrayList<String> work=new ArrayList<>();
		work.add("spring");
		work.add("security");
		work.add("angular");
		return work;
	}

	@Bean
	public Employee getEmployee()
	{
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("yuv");
		emp.setAddress(getAddress());
		emp.setWork(getWork());
		return emp;
	}
	
}
