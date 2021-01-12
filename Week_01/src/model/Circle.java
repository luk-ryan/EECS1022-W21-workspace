package model;

public class Circle {
	/*
	 * Utility methods: does not require creating of objects in order to use
	 */
	public static double getArea(double radius) {
		double area = 0.0;
		// Correct implementation
		area = 3.14 * radius * radius;
//		// Wrong implementation
//		area = 2 * 3.14 * radius;
		return area;
	}
}
