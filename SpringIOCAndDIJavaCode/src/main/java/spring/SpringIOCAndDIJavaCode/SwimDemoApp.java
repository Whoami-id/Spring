package spring.SpringIOCAndDIJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimDemoApp {
	
	public static void main(String...strings) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println("email: "  + coach.getEmail());
		System.out.println("team: " + coach.getTeam());
		
		context.close();
		
		
	}

}
