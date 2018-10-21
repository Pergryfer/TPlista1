package test.pmd;

public class Army {
	public int numberOfSoldiers;
	public int armyTradition;
	public double power;
	public String name;
	
	public Army(String a, int b, int c) {
		numberOfSoldiers = b;
		armyTradition = c;
		power = numberOfSoldiers * 0.2 * armyTradition;
		name = a;
	}
}
