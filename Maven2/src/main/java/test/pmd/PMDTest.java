package test.pmd;

public class PMDTest{

	public static void main(String[] args) {
	    PMDTest.CALL_METHOD("Fight Symulator");
	    PMDTest.CallStartFight();

		
	    Army Sauron = new Army("Orks",10000,4);
	    Army Aragon = new Army("Gondor",8000,10);
	    Battle HelmowyJar = new Battle(Sauron, Aragon);
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(HelmowyJar.whoWin());
	}


	public static void CALL_METHOD(String INPUT_PARAMETER) {
	    System.out.println(INPUT_PARAMETER);
	}
	
	public static void CallStartFight() {
		System.out.println("Battle Begins...");
	}
}