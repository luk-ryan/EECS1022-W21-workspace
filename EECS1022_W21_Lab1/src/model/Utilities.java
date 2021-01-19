package model;

public class Utilities {
	
	/*
	 * Input parameters:
	 * 	- `ft` is the first term in the sequence
	 *  - `ratio` is the common rations among terms in the sequence
	 */
	public static String getGeometricSequence(int ft, int ratio) {
		String result = "";
		
		// compute all 5 terms of sequence as well as the average
		int term1 = ft;
		int term2 = ft * ratio;
		int term3 = ft * ratio * ratio;
		int term4 = ft * ratio * ratio * ratio;
		int term5 = ft * ratio * ratio * ratio * ratio;
		double average = (term1 + term2 + term3 + term4 + term5) / 5.0;
		
		// write exact string using the results above
		result = "[" + term1 + "][" + term2 + "][" + term3 + "][" + term4 + "][" + term5 + "] has average " + average;

		return result;
	}
	
	/*
	 * Input parameters:
	 *   - `weight` is the user's weight in pounds
	 *   - `height` is the user's height in inches 
	 */
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		// convert weight into kg and height into meters
		double k = weight * 0.4536;
		double m = height * 0.0254;
		
		// compute result using BMI equation
		result = k / (m * m);
		
		return result;
	}
	
	/*
	 * Input parameters:
	 *   - `seconds` is the number of seconds to be converted
	 */
	public static String getTimeConversion(int seconds) {
		String result = "";

		// convert the seconds to days (86400 seconds in a day) and get remaining seconds
		int days = seconds / 86400;
		seconds = seconds % 86400;
		
		// convert the new seconds value to hours (3600 seconds in an hour) and get remaining seconds
		int hours = seconds / 3600;
		seconds = seconds % 3600;
		
		// convert the new seconds value to minutes (60 seconds in a minute) and save remaining seconds
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		// using the conversions above, write out the final result string
		result = days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
		
		return result;
	}
}
