package spring.SpringIOCAndDIJavaCode;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	
	
	private String [] data = {"Beware of the wolf","Diligence is the mother of good  luck","The journey is the reward"};
	
	private Random r = new Random();

	@Override
	public String getFortune() {
		int index = r.nextInt(data.length);
		String str = data[index];
		return str;
	}

}
