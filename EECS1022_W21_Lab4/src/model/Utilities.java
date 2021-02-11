package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		int lengthNew = 0;
		
		// Find length of the new array
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] % 3 == 0) {
				lengthNew += 1;
			}
		}
		
		// set the length after finding it in the previous step
		result = new int[lengthNew];
		int count = 0;
		
		// replace all the indexes with the appropriate value
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] % 3 == 0) {
				result[count] = numbers[i];
				count += 1;
			}
		}
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		int numberOfn = 0;

		// Find number of times n appears in the original array
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] == n) {
				numberOfn += 1;
			}
		}
		
		// subtract the number of times n appears from length of old array to get length of new array
		result = new int[numbers.length - numberOfn];
		int count = 0;
		
		// replace all the required integers into the new array without n
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] != n) {
				result[count] = numbers[i];
				count += 1;
			}
		}
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = new String[numbers.length];
		int[] temp = null;
		
		// start at the last element of the resulting array
		for (int i = numbers.length-1; i >= 0; i --) {
			temp = new int[i+1];
			
			// using a temporary array, take out unnecessary numbers from the input array
			for (int j = 0; j <= i; j ++) {
				temp [j] = numbers[j];
			}
			// format one element and continue from last element to first
			result[i] = "[";
			for (int k = 0; k < temp.length; k ++) {
				result[i] += temp[k];
				if (k < temp.length - 1) {
					result[i] += ", ";
				}
			}
			result[i] += "]";
		}
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		// loop through the entire original list 3 times
		for (int i = 0; i < 3; i ++) {
			// each time, check if each element in the original list has remainder of 0, 1, or 2 when divided by 3
			for (int j = 0; j < numbers.length; j ++) {
				if (numbers[j] % 3 == i) {
					result[count] = numbers[j];
					count += 1;
				}
			}
		}
		
		
		return result;
	}
}
