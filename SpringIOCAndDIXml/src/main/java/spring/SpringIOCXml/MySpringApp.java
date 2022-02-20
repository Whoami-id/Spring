package spring.SpringIOCXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	
	public static void main(String...strings) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Coach coach = context.getBean("mycoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		
		System.out.println(coach.getDailyFortune());
		
		
		
		
		context.close();
	}

}
