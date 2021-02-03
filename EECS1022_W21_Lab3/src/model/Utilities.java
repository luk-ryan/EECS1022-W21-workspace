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
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		return result;
	}	
}
