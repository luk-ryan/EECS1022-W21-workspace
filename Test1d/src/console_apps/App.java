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
		
		/*
		 * Task 1: Get BMI
		 */
		System.out.println("Enter your weight(kilogram or pound):");
		double valueOfWeight = input.nextDouble();
		System.out.println("kilogram or pound (case sensitive)?");
		String unitOfWeight = input.next();
		
		System.out.println("Enter your height(inch or foot):");
		double valueOfHeight = input.nextDouble();
		System.out.println("inch or foot (case sensitive)?");
		String unitOfHeight = input.next();
		
		String report = Utilities.getBMIReport(unitOfWeight, valueOfWeight, unitOfHeight, valueOfHeight);
		
		System.out.println(report);
		
		
		input.close();
	}

}
