// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		
		int number =  Integer.parseInt(args [0]);

		int firstchar = (number / 100); // hundreds
		int secondchar1 = (number / 10); // 54
		int secondchar = (secondchar1 % 10) ; //second digit

		int thirdchar = (number % 10); // last digit
		System.out.println(firstchar + " hundreds, " + secondchar + " tens, " + "and " + thirdchar + " ones.");
	}
}
