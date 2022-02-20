package spring.SpringIOCXml;

public class TrackCoach implements Coach {

	private FortuneService fortuneSevice;
	
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneSevice) {
		this.fortuneSevice = fortuneSevice;

	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting paractic";
	}

	@Override
	public String getDailyFortune() {

		return fortuneSevice.getFortune();
	}
	
	
	//add init mehode
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside methode domyStartupStuff");
	}
	
	//add destroy mehode
		public void doMyCleanStuff() {
			System.out.println("TrackCoach: inside methode domycleanStuff");

		}

}
