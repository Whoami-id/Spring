package spring.SpringIOCAndDIJavaCode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	/* Constructor injection
	@Autowired
	public TennisCoach( FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	/* Setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Startup Stuff");
	}
	
	//define destroy methode
	@PreDestroy
	public void doMyCleanupSuff() {
		System.out.println("Cleanup Stuff");
	}

}
