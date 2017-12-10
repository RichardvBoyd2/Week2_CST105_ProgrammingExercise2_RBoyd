/** Program: Sum
 * File: Sum.java
 * Summary: Reads 5-digit integer input, then adds all digits and prints sum
 * Author: Richard Boyd
 * Date: December 10th, 2017
 */

import java.util.Scanner;
public class Sum {
	private static Scanner scan;

	public static void main(String[] args) {
		int one, two, three, four, five, sum;
		scan = new Scanner(System.in);
		System.out.println("Enter a 5-digit positive integer");
		int input = scan.nextInt(); //Gets input after asking for integer
		one = input % 10; //The next 8 lines separate each digit from the five digit integer and store them as individual variables 
		input = input / 10;
		two = input % 10;
		input = input / 10;
		three = input % 10;
		input = input / 10;
		four = input % 10;
		five = input / 10;
		sum = one + two + three + four + five;
		System.out.println("The sum of the digits is "+five+" + "+four+" + "+three+" + "+two+" + "+one+" = "+sum);
	}
}
