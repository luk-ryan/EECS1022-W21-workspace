package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Your submission will only be graded against JUnit tests.
		 * 
		 * If you wish to test your utility methods quickly,
		 * you may use this console application class by calling them.
		 * 
		 * However, you must make sure that you do not introduce 
		 * any compilation errors here. 
		 * 
		 * Reminders:
		 *  - Write `System.out.println` to prompt user inputs and output result to the console. 
		 * 	- Write `input.nextInt()` to read an integer from user.
		 *  - Write `input.nextDouble()` to read a double from user.   
		 */
//		
//		/*	Task 1:
//		 *  Given an input double number that denotes the radius of a circle,
//		 *  return its area.
//		 */
//		System.out.println("Enter a radius: ");
//		Double radius = input.nextDouble();
//		Double area = Utilities.areaOfCircle(radius);
//		System.out.println("The area of the circle is " + area + "\n");
//		
//		/*  Task 2:
//		 *  Given four input integers a, b, c, and d,
//		 *  return their average with precision.
//		 */
//		System.out.println("Enter the first integer: ");
//		int a  = input.nextInt();
//		System.out.println("Enter the second integer: ");
//		int b  = input.nextInt();
//		System.out.println("Enter the third integer: ");
//		int c  = input.nextInt();
//		System.out.println("Enter the fourth integer: ");
//		int d  = input.nextInt();
//		
//		Double average = Utilities.averageOf(a, b, c, d);
//		System.out.println("The average is " + average + "\n");
//		
//		/*  Task 3:
//		 *  Given three input integers (which may or may not be equal),
//		 *  return the maximum.
//		 */
//		System.out.println("Enter the first integer: ");
//		int x  = input.nextInt();
//		System.out.println("Enter the second integer: ");
//		int y  = input.nextInt();
//		System.out.println("Enter the third integer: ");
//		int z  = input.nextInt();
//		
//		int maximum = Utilities.maximumOf(x, y, z);
//		System.out.println("The maximum integer is " + maximum + "\n");
//		
//		/*  Task 4:
//		 *  Given four input integers,
//		 *  return whether or not they represent an arithmetic sequence.
//		 *  An arithmetic sequence is has a common difference between every consecutive numbers.
//		 *  e.g., 1, 3, 5, 7 is an arithmetic sequence with 2 being the common difference.
//		 *  e.g., 10, 8, 6, 4 is an arithmetic sequence with -2 being the common difference.
//		 */
//		System.out.println("Enter the first integer: ");
//		int n1  = input.nextInt();
//		System.out.println("Enter the second integer: ");
//		int n2  = input.nextInt();
//		System.out.println("Enter the third integer: ");
//		int n3  = input.nextInt();
//		System.out.println("Enter the fourth integer: ");
//		int n4  = input.nextInt();
//		
//		String report = Utilities.isArithmeticSeq(n1, n2, n3, n4);
//		System.out.println(report);
		
		
		
		input.close();
	}

}
