package console_apps;
import java.util.Scanner;

import model.Circle;

/*
 * This is version 2 of a console application
 * We will prompt the user of radius values of 2 circles
 * The application will output the areas of the input circles
 * This version improves version 1 by calling a reusable utility method
 */
public class CircleApp2 {
	// main method: entry point of execution
	public static void main(String[] args) {
		// Starting execution of application
		// System.in denotes the standard input
		Scanner input = new Scanner(System.in);
		
		// Start application code here
		
		/*
		 * Calculate the first circle
		 */
		// Step 1: Prompt the user for radius of circle
		System.out.println("Enter the radius of the first circle: ");
		// Declare a variable to store user input
		// Step 2: Read a floating-point number from user
		double radius1 = input.nextDouble(); 
		// Step 3: Compute area of input circle
		
		// Change: reuse formula calculation by calling the utility method
		double area1 = Circle.getArea(radius1);
		
		String area1s = String.format("%.2f", area1);
		// Step 4: Output result back to user
		System.out.println("Area of circle is: " + area1s);
		
		/*
		 * Calculate the second circle
		 */
		// Step 1: Prompt the user for radius of circle
		System.out.println("Enter the radius of the second circle: ");
		// Declare a variable to store user input
		// Step 2: Read a floating-point number from user
		double radius2 = input.nextDouble(); 
		// Step 3: Compute area of input circle
		
		// Change: reuse formula calculation by calling the utility method
		double area2 = Circle.getArea(radius2);
		
		String area2s = String.format("%.2f", area2);
		// Step 4: Output result back to user
		System.out.println("Area of circle is: " + area2s);
		
		// end of application code
		
		input.close();
	}
}
