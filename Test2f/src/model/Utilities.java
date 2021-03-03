package model;

public class Utilities {
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library class (e.g., ArrayList, Arrays)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 	- You can define helper methods if you wish.
	 * 
	 * Only write lines of code within the methods given to you. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests  
	 */
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: an array of integers
	 *	- `indices`: an array of integers (each of which may or may not be a valid index for `seq`) 
	 *
	 * Assumptions:
	 * 	- `seq` may be empty.
	 * 	- `indices` may be empty. 
	 * 	- `indices` may contain duplicates.
	 *  
	 * What to return?
	 *  - For each integer value in `indices`, if it is a valid index for input array `seq`, 
	 *  	then use it to index into `seq` and include the result in the output array.
	 *  
	 *  For example: Say `seq` is {23, 46, 69} and `indices` is {2, -1, 0, 3, 0, 2}
	 *  	(where indices -1 and 3 are invalid, so only indices 2, 0, 0, 2 are used)
	 *   	Then the method should return {69, 23, 23, 69} 
	 *   
	 *  Note: Order of elements in the output array corresponds to the order in which
	 *  		valid indices in the `indices` array are arranged. 
	 *  
	 *  That is, the output array may be empty if the input array `seq` is empty,
	 *  	or if the input array `indices` does not contain any valid indices.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task1(int[] seq, int[] indices) {
		int[] result = null;
		
		// Your implementation of this method starts here. 
		
//		int lengthNew = 0;
//		
//		// Find length of the new array
//		for (int i = 0; i < indices.length; i ++) {
//			if (indices[i] <= 0 && indices[i] < seq.length) {
//				lengthNew += 1;
//			}
//		}
//		
//		// set the length after finding it in the previous step
//		int[] newIndices = new int[lengthNew];
//		result = new int[lengthNew];
//		int count = 0;
//		
//		for (int i = 0; i < indices.length; i ++) {
//			if (indices[i] <= 0 && indices[i] < seq.length - 1) {
//				newIndices[count] = indices[i];
//				count += 1;
//			}
//		}
//		
//		for (int i = 0; i < result.length; i ++) {
//			result[i] = seq[newIndices[i]];
//		}

		// Do not modify this return statement. 
        return result;
    }

	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  - Return an array that represents an encoding of `seq`, by adopting the following principle:
	 *  	Element at each odd index (e.g., at index 1, at index 3, and so on) of the return array specifies 
	 *  		how many times the element at the previous even index (e.g., at index 0, at index 2, and so on) repeats 
	 *  		in the input array `seq`.
	 *  	
	 *  	For example, {2, 4, 1, 3} encodes that value 2 (at even index 0) should repeat 4 times (as specified at odd index 1), 
	 *  		and similarly, value 1 should repeat 3 times. 
	 *  		
	 *  		Say `seq` is {2, 2, 2, 2, 1, 1, 1}.
	 *  		Then the method should return an encoded array {2, 4, 1, 3}.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task2(int[] seq) {
        int[] result = null;
		
		// Your implementation of this method starts here. 
        int lengthNew = 0;
        
        for (int i = 0; i < seq.length; i ++) {
			if (i == 0) {	
				lengthNew += 2;
			}
			else if (seq[i] != seq[i-1]) {
				lengthNew += 2;
			}
		}
        result = new int[lengthNew];
        int temp = 0;
		int count = 0;
		int tempCount = 0;
		
    	for (int i = 0; i < seq.length; i ++) {
			temp = seq[i]; 
			tempCount = 0;
			
			for (int j = 0; j < seq.length; j++ ) {
				if (temp == seq[j]) {
					tempCount += 1;
				}
			}
			if (i == 0) {
				result[count] = temp;
				result[count+1] = tempCount;
				count += 2;
			}
			else if (temp != result[count-2]) {
				result[count] = temp;
				result[count+1] = tempCount;
				count += 2;
			}
		}
        
		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  -  Return another array of strings, each of which denoting a non-empty suffix of the input array.
	 *     
	 *     A suffix of array `seq` contains its last n elements (where 1 <= n <= seq.length). 
	 *     
	 *  	For example, if the input array is:
	 *   
	 *  		<3, 1, 4>
	 *  
	 *  	Then the output or returned array of string values is:
	 *  		
	 *  		<"[3, 1, 4]", "[1, 4]", "[4]">
	 *  	
	 *  	where each suffix is structured as a comma-separated list surrounded by square brackets.	
	 *  
	 *  	Note that the length of the output array is equal to the length of the input array. 
	 *  	
	 *  	Also, elements in the output array are ``sorted'' by the lengths of the suffixes. 
	 *  		(e.g,. the last element is the suffix of length 1, the second last element is the suffix of length 2).
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String[] task3(int[] seq) {
		String[] result = null;

		
		// Your implementation of this method starts here. 
		result = new String[seq.length];
		int[] temp = null;
		
		
		for (int i = 0; i < seq.length; i ++) {
			temp = new int[i+1];
			
			// using a temporary array, take out unnecessary numbers from the input array
			for (int j = 0; j <= i; j ++) {
				temp [j] = seq[j];
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

		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `sa`: an array of strings
	 *
	 * Assumptions:
	 * 	- Input array `sa` is non-empty and contains at least one elements.
	 * 	– The string value that appears the most frequently is unique.
	 *  
	 * What to return?
	 *  - Return the string value that appears the most frequently, 
	 *  	i.e., appear for the highest number of times.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String task4(String[] sa) {
    	String result = null;

		// Your implementation of this method starts here. 
		result = sa[0];
		String temp = null;
		int count = 1;
		int tempCount = 0;
		
		
    	for (int i = 0; i < sa.length; i ++) {
			temp = sa[i]; 
			
			for (int j = 0; j < sa.length; j++ ) {
				if (temp == sa[j]) {
					tempCount += 1;
				}
			}
			if (tempCount > count) {
				result = temp;
				count = tempCount;
			}
		}

		// Do not modify this return statement. 
        return result;
    }	 
}

