package test.pmd;

import java.util.Random;

public class Battle {
	Random ran = new Random();

	private double army1Power;
	private String army1Name;

	private double army2Power;
	private String army2Name;

	public Battle(Army army1, Army army2) {
		army1Power = army1.power;
		army1Name =  army1.name;
		army2Power = army2.power;
		army2Name = army2.name;
	}
	
	String whoWin() {
		if(army1Power * ran.nextInt(3) > army2Power * ran.nextInt(3)) {
			return army1Name + " win against " + army2Name;
		}else {
			return army2Name + " win against " +army1Name;
		}	
	}
}
