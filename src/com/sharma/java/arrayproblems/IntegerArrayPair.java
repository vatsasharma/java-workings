package com.sharma.java.arrayproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Srivatsa
 * 
 *         Print integer pair in array whose sum is equal to given number
 *
 */
public class IntegerArrayPair {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int number = 10;

		// With complexity O(N^2)
		printIntegerArrayTraditionalMethod(array, number);

		// With complexity O(NlogN)
		printIntegerArrayPair(array, number);

		// With complexity O(N)
		printIntegerPairWithOOfN(array, number);
	}

	/**
	 * Traditional way to find integer pair with complexity O(N^2)
	 * 
	 * @param array
	 * @param number
	 */
	private static void printIntegerArrayTraditionalMethod(final int[] array, final int number) {
		int steps = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (i + j == number)
					System.out.println("{ " + i + " ," + j + " }");
				steps++;
			}
		}
		System.out.println("Steps taken : " + steps);
	}

	/**
	 * With complexity O(NlogN) without extra memory
	 * 
	 * @param array
	 * @param number
	 */
	private static void printIntegerArrayPair(final int[] array, final int number) {
		int min = 0;
		int max = array.length - 1;
		int steps = 0;

		while (max >= min) {
			if (array[max] + array[min] == number) {
				System.out.println("{ " + array[min] + " ," + array[max] + " }");
				min++;
				max--;
			} else if (number > min) {
				min++;
			} else if (number < max) {
				max--;
			}
			steps++;
		}
		System.out.println("Steps taken : " + steps);
	}

	/**
	 * Complexity O(N) on using hash set and requires extra space for storing values
	 * in hash set
	 * 
	 * @param array
	 * @param number
	 */
	private static void printIntegerPairWithOOfN(final int[] array, final int number) {
		if (array.length < 2)
			return;

		Set<Integer> set = new HashSet<>(array.length);
		int steps = 0;

		for (int value : array) {
			int target = value - number;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.println("{ " + value + " ," + target + " }");
			}
			steps++;
		}

		System.out.println("Steps taken : " + steps);
	}

}
