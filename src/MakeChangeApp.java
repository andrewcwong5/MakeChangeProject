
public class MakeChangeApp {

	public static void main(String[] args) {
		makeChange();
	}
	
	public static void makeChange () {
		double change = 0.00;
		double twentyBill = 20.00 ; double tenBill = 10.00 ;
		double fiveBill = 5.00 ; double oneBill = 1.00;
		double quarter = 0.25 ; double dime = 0.10 ; 
		double nickel = 0.05 ; double penny = 0.01 ;
		int twentyCount = 0;
		int tenCount = 0;
		int fiveCount = 0;
		int oneCount = 0;
		int quarterCount = 0;
		
		change = 13.25;
		//loop to make change
		while (change != 0.00) {
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
			int dimeCount = 0;
			dimeCount ++ ;
			}
			else if (change >= 0.05) {
				change = change - nickel ;
			int nickelCount = 0;
			nickelCount ++ ;
			}
			else if (change >= 0.01) {
				change = change - penny ;
			int pennyCount = 0;
			pennyCount ++ ;
			}
		}
		System.out.println("Give change: " + twentyCount + 
				"x$20, " + tenCount + "x$10, " + fiveCount +
				"x$5, " + oneCount + "x$1, " +quarterCount +
				"xquarters, ") ;
			
	}
}