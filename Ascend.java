// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args [0]); // the limit

		int first = (int)(Math.random()*lim);
		int second = (int)(Math.random()*lim);
		int third = (int)(Math.random()*lim);

		int min = Math.min(Math.min(first, second),third);
		int max = Math.max(Math.max(first, second),third);
		int mid = first + second + third - min - max;

		System.out.println( max+ " "+min+" "+mid);
		System.out.println(min+" "+mid+" "+max);
	}
}
