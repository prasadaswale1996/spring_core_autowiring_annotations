package spring_core_autowiring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ComputerContext.xml");
        Student obj1 = ctx.getBean(Student.class);
        
        
        System.out.println(obj1);
	}
}
