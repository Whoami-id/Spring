package spring.SpringIOCXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	
	public static void main(String...strings) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-spring.xml");
		
		Coach coach = context.getBean("mycoach", Coach.class);
		Coach coach2 = context.getBean("mycoach", Coach.class);
		
		//check if they are the same beans
		boolean resutl = coach == coach2;
		
		System.out.println("\n pointing to same object: " + resutl);
		
		System.out.println("\nMemory location for each coach: " + coach);
		System.out.println("\nMemory location for each coach: " + coach2 + "\n");
		
		context.close();
		
		

		
	}

}
