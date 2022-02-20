package spring.SpringIOCAndDIAnnotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {
	
	public static void main(String...strings) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		Coach coach2 = context.getBean("thatSillyCoach", Coach.class);
		
		
		boolean result= coach == coach2;
		
		System.out.println("resutl: " + result);
		System.out.println("coach: " + coach);
		System.out.println("coach2: " + coach2);
		
		
		
	}

}
