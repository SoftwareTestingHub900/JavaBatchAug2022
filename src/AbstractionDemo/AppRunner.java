package AbstractionDemo;

public class AppRunner {
	public static void main(String[] args) {
		
	//	SBP obj = new SBP;
		
		MEEZANBANK Bank = new MEEZANBANK();
		Bank.depositMoney();
		Bank.interaDayTrading();
		Bank.regularTrading();
		Bank.m1();
		
			
		
	}

}
