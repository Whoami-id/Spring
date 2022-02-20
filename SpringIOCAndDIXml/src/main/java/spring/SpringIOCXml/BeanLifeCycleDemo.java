package spring.SpringIOCXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	
	public static void main(String...strings) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifeCycle-spring2.xml");
		
		Coach coach = context.getBean("mycoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
	
		
		context.close();
		
		

		
	}

}
