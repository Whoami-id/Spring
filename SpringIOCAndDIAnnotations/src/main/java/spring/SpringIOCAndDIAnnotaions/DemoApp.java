package spring.SpringIOCAndDIAnnotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
	public static void main(String...strings) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	
	}

}
