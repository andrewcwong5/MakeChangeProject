import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
			
		makeChange();
	}
	
	public static void makeChange () {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter price of item: ");
		double price = kb.nextDouble();
		System.out.println("Enter amount tendered by customer: ");
		double cashPay = kb.nextDouble();
		double change = cashPay - price ;
		
		double twentyBill = 20.00 ; double tenBill = 10.00 ;
		double fiveBill = 5.00 ; double oneBill = 1.00;
		double quarter = 0.25 ; double dime = 0.10 ; 
		double nickel = 0.05 ; double penny = 0.01 ;
		int twentyCount = 0;
		int tenCount = 0;
		int fiveCount = 0;
		int oneCount = 0;
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		int pennyCount = 0;
			
			if (change < 0.0) {
				System.out.println("Insufficient payment need $" +
			(price - cashPay) );
			}
			else {
			System.out.println("Change due: $" + change);
			}
			
		//loop to make change
		while (change >= 0.001) {
			if (change >= 20.00) {
				change = change - twentyBill ;
			twentyCount ++ ; 
			}
			else if (change >= 10.00) {
				change = change - tenBill ;
			tenCount ++ ;
			}
			else if (change >= 5.00) {
					change = change - fiveBill ;
			fiveCount ++ ;
			}
			else if (change >= 1.00) {
				change = change - oneBill ;
			oneCount ++ ;
			}
			else if (change >= 0.25) {
				change = change - quarter ;
				quarterCount ++ ;
			}
			else if (change >= 0.10) {
				change = change - dime ;
				dimeCount ++ ;
			}
			else if (change >= 0.05) {
				change = change - nickel ;
				nickelCount ++ ;
			}
			else if (change >= 0.01) {
				change = change - penny ;
				pennyCount ++ ;
//				System.out.println("less than penny" + change);
			}
			else if (change >= 0.0005 ) {
				pennyCount ++ ;
				change = 0.00;
			}
				
			kb.close();
		}
		
		System.out.println("Give change: " + twentyCount + 
				" $20, " + tenCount + " $10, " + fiveCount +
				" $5, " + oneCount + " $1, \n" + quarterCount +
				" quarter, " + dimeCount + " dime, " + nickelCount +
				" nickel, " + pennyCount + " penny") ;
		
	}
}