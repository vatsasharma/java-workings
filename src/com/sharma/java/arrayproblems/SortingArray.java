package com.sharma.java.arrayproblems;

import java.util.Arrays;

/**
 * 
 * @author Sharma
 * 
 *         Sorting techniques
 *
 */
public class SortingArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(bubbleSort(new int[] { 3, 2, 1 })));
	}

	/*
	 * Sorting array using Bubble sorting technique with complexity O(n*n)
	 */
	private static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int temp = array[j + 1];
				if (array[j] > temp) {
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
