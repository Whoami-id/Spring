package spring.SpringIOCAndDIJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
	
	public static void main(String...strings) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
		
	}

}
