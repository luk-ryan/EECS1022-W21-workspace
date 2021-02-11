package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";

		// when user inputed negative integers
		if (lower < 0 || upper < 0) {
			result = "Error: both bounds must be non-negative";
		}
		// when upper bound is lower than lower bound
		else if (upper < lower) {
			result = "Error: lower bound " + lower +" is not less than or equal to upper bound " + upper;
		}
		// when the upper and lower bounds are equal to each other
		else if (upper - lower == 0) {
			result = "1 number between " + lower + " and " + upper + ": <";
			
			// put the correct bracket around the number
			if (lower % 3 == 0) {
				result = result + "(" + lower + ")>";
			}
			if (lower % 3 == 1) {
				result = result + "[" + lower + "]>";
			}
			if (lower % 3 == 2) {
				result = result + "{" + lower + "}>";
			}
		}
		// When there are more than 1 number between the two bounds
		else {
			result = (upper + 1 - lower) + " numbers between " + lower + " and " + upper + ": <";
			
			// run through every number, and put the correct bracket around it
			for (int i = lower; i <= upper; i++ ) {
				
				if (i % 3 == 0) {
					if (i == upper) {
						result = result + "(" + i + ")>";
					}
					else {
						result = result + "(" + i + "), ";
						}
				}
				else if (i % 3 == 1) {
					if (i == upper) {
						result = result + "[" + i + "]>";
					}
					else {
					result = result + "[" + i + "], ";
					}
				}
				else if (i % 3 == 2) {
					if (i == upper) {
						result = result + "{" + i + "}>";
					}
					else {
					result = result + "{" + i + "}, ";
					}
				}
			}
		}
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "{";
		int value = 0;
		int tempValue = 0;
		int sum = 0;
		double avg = 0;
		String sequence = "<";
		
		// n represents the number of times we need to loop through the sequence
		for (int i = 1 ; i <= n; i++) {
			value = ft + (i-1) * d;
			sum += value;
			avg = sum / (float) i;
			sequence = "<";
			
			// setting up the sequence at each stage (i)
			for  (int j = 1; j <= i; j++) {
				tempValue = ft + (j-1) * d;
				
				if (j == i) {
					sequence = sequence + tempValue + ">";
				}
				else {
					sequence = sequence + tempValue + ", ";
				}
			}
			// check whether this is the last term in sequence and format string appropriately
			if (i == n) {
				result += String.format("[sum of %s: %d ; avg of %s: %.2f]", sequence, sum, sequence, avg);
			}
			else {
				result += String.format("[sum of %s: %d ; avg of %s: %.2f], ", sequence, sum, sequence, avg);
			}
		}		
		result += "}";
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "<";
		int value1 = 0;
		int value2 = 0;
		
		// when both sequences have the same number of terms
		if (n1 == n2) {
			for (int i = 1; i <= n1; i++) {
				value1 = ft1 + (i-1) * d1;
				value2 = ft2 + (i-1) * d2;
				
				if (i == n1) {
					result += "(" + value1 + "), [" + value2 + "]";
				}
				else {
					result += "(" + value1 + "), [" + value2 + "], ";
				}
			}
		}
		// when the first sequence has less terms than the second
		else if (n1 < n2) {
			for (int i = 1; i <= n1; i++) {
				value1 = ft1 + (i-1) * d1;
				value2 = ft2 + (i-1) * d2;

				result += "(" + value1 + "), [" + value2 + "], ";
			}
			for (int j = (n1+1); j <= n2; j++) {
				value2 = ft2 + (j-1) * d2;
				
				if (j == n2) {
					result += "[" + value2 + "]";
				}
				else {
					result += "[" + value2 + "], ";
				}
			}
		}
		// when the second sequence has less terms than the first
		else if (n2 < n1) {
			for (int i = 1; i <= n2; i++) {
				value1 = ft1 + (i-1) * d1;
				value2 = ft2 + (i-1) * d2;
				
				result += "(" + value1 + "), [" + value2 + "], ";
			}
			for (int j = (n2+1); j <= n1; j++) {
				value1 = ft1 + (j-1) * d1;
				
				if (j == n1) {
					result += "(" + value1 + ")";
				}
				else {
					result += "(" + value1 + "), ";
				}
			}
		}
		result += ">";
		
		return result;
	}	
}
