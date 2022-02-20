package spring.SpringIOCXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String... strings) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// retrieve bean form spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methode on the bena
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		
		
		//close the context
		context.close();
	}

}
