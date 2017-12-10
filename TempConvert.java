/** Program: TempConvert
 * File: TempConvert.java
 * Summary: Converts two temperatures from user input
 * Author: Richard Boyd
 * Date: December 10th, 2017
 */

import java.util.Scanner;
public class TempConvert {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in); //sets up scanner
		System.out.println("Enter a temperature in degrees Fahrenheit.");
		double tempF = scan.nextDouble(); //read input from user
		double tempC = (tempF - 32) * (5.0/9.0); //conversion to find C
		System.out.println(tempF+"F is equivalent to "+tempC+"C");
		System.out.println("Enter a temperature in degrees Celsius");
		tempC = scan.nextDouble();
		tempF = (tempC * (9.0/5.0)) + 32;
		System.out.println(tempC+"C is equivalent to "+tempF+"F");	
	}

}
