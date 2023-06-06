package AbstractionDemo;

public class MEEZANBANK extends ParentDemo implements SBP, SEBI{

	@Override
	public void depositMoney() {
	System.out.println("Meezan bank deposit Money");
	}

	@Override
	public void withdrawMoney() {
	System.out.println("Meezaan bank withdraw Money");
		
	}

	@Override
	public void interaDayTrading() {
		System.out.println("Meezan bank intra day trading");
		
	}

	@Override
	public void regularTrading() {
		System.out.println("Meezan bank Regular trading");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}
	
	

}
