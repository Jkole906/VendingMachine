package VendingMachine;

import java.math.BigDecimal;

public class Change

{
	
	
	private BigDecimal balance;

	
	
	//Methods
	public BigDecimal makeChange() {
		int quarterCounter = 0;
		int dimeCounter = 0;
		int nickelCounter = 0;
		while(balance.compareTo(new BigDecimal (0.00)) >0) {
		if(balance.compareTo(new BigDecimal (0.25)) >0) {
			balance.subtract(new BigDecimal (0.25));
			quarterCounter++;
		}else if(balance.compareTo(new BigDecimal (0.10)) >0) {
				balance.subtract(new BigDecimal (0.10));
				dimeCounter++;
		}else if(balance.compareTo(new BigDecimal (0.5)) >0) {
			balance.subtract(new BigDecimal (0.5));
			nickelCounter++;
		}
		}
			System.out.println("Your change is " + quarterCounter + " quarters, " + dimeCounter + " dimes, " + nickelCounter + " nickels.");
			balance = new BigDecimal (0.00);
			return balance;
		}
	}