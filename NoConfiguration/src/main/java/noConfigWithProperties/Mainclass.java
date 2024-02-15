package noConfigWithProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee obj = (Employee) context.getBean("getEmployee", Employee.class);
		System.out.println(obj);
	}

}
