package com.sharma.java.arrayproblems;

import java.util.BitSet;

/**
 * @author Sharma
 * 
 *         Finding missing number in 1 to 100 numbers
 */
public class MissingNumber {

	public static void main(String[] args) {

		printMissingNumbers(new int[] { 1, 2, 3, 4, 4, 6, 7, 8, 9 }, 10);

		printSingleMissingNumber(new int[] { 1, 2, 4, 5 }, 5);

	}

	/*
	 * Method prints missing numbers in array containing duplicates / more than 1
	 * missing number
	 */
	private static void printMissingNumbers(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);

		for (int n : numbers)
			bitSet.set(n - 1);

		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}

	/*
	 * Method to find missing number if it contains single missing number
	 */
	private static void printSingleMissingNumber(int[] array, int count) {

		int expectedSum = count * (count + 1) / 2;
		int resultedSum = 0;

		for (int i = 0; i < count - 1; i++)
			resultedSum += array[i];

		System.out.println("Single missing numbers : " + (expectedSum - resultedSum));

	}

}
