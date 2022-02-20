package spring.SpringIOCXml;

public class CricketCoach implements Coach {

	private FortuneService fortuneSevice;

	private String email;
	private String team;

	public CricketCoach() {
		System.out.println("no args constructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSevice.getFortune();
	}

	public void setFortuneSevice(FortuneService fortuneSevice) {
		this.fortuneSevice = fortuneSevice;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
