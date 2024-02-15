package stereotypeAnnotationsExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("stereotypeAnnotationsExample/employeeConfig.xml");
		Employee obj= (Employee) context.getBean("employee",Employee.class);
		System.out.println(obj);
	}
	
}
