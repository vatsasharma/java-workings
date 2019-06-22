package com.sharma.java.arrayproblems;

import java.util.Arrays;

/**
 * 
 * @author Sharma
 * 
 *         Removes duplicates from the array without using Collection API
 *
 */
public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {

		int[][] testArray = { { 1, 2, 3, 4, 5, 3 }, { 1, 2, 4, 5, 4, 5, 6 }, { 1, 1, 1, 2, 3, 3, 3 } };

		for (int[] array : testArray) {
			System.out.println("Before removing duplicates: " + Arrays.toString(array));
			System.out.println("After removing duplicates : " + Arrays.toString(removeDuplilcates(array)));
			System.out.println();
		}

	}

	/**
	 * This method removes duplicates by replacing its value to '0'
	 * 
	 * @param takes integer array
	 * @return integer array
	 */
	private static int[] removeDuplilcates(int[] array) {
		int[] result = new int[array.length];

		Arrays.sort(array);
		int previous = array[0];
		result[0] = array[0];

		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			if (previous != value)
				result[i] = value;
			previous = array[i];
		}
		return result;
	}

}
