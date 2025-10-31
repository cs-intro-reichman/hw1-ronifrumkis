// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args [0]); 
		double rate = Double.parseDouble (args [1]);
		int n = Integer.parseInt (args [2]);
		double newrate = rate;

		rate = rate/100; // make rate a precentage
		double futurevalue;
		
		
		futurevalue = currentValue * Math.pow((1 + rate),n);

		System.out.println();
		System.out.println("After"+" "+ n +" "+"years,"+" $"+currentValue+ " saved at "+ newrate +"% will yield "+ "$"+(int)futurevalue);
	}
}