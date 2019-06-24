package com.sharma.java.arrayproblems;

import java.util.Arrays;

/**
 * 
 * @author Sharma
 * 
 *         Find smallest and largest number in unsorted array.
 * 
 *         You can achieve by Sorting the array first which has complexity
 *         O(NlogN) and then retrieve first and last element of array which is a
 *         constant retrieval operation i.e O(1).
 * 
 */
public class FindingSmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 63, 4, 5, 65, 23 };

		// Sorting takes O(NlogN)
		Arrays.sort(numbers);

		// Retrieval takes O(1)
		System.out.println("Smallest number : " + numbers[0]);
		System.out.println("Largest number : " + numbers[numbers.length - 1]);

	}

}
