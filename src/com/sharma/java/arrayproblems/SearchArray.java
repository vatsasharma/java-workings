package com.sharma.java.arrayproblems;

/**
 * 
 * @author Sharma
 * 
 *         Searching element in an array using different techniques
 * 
 */
public class SearchArray {

	public static void main(String[] args) {

		System.out.println("Value found : " + linearSearch(new Integer[] { 1, 3, 4, 5, 6, 7, 8, 9 }, 3));
		System.out.println("Value found : " + linearSearch(new String[] { "Hello", "World", "Big", "bee" }, null));

		System.out.println("Value found at index: "
				+ recursiveLinearSearch(new String[] { "Hello", "World", "Big", "bee" }, 0, 3, "Big"));

		System.out.println("Value found : " + binarySearch(new int[] { 1, 3, 4, 5, 6, 7, 8, 9 }, 9));

	}

	/**
	 * linearSearch() method searches element using linear search and print index of
	 * the array if value found with complexity O(n)
	 * 
	 * @param               <T>
	 * 
	 * @param valueToSearch
	 * 
	 */
	private static <T> boolean linearSearch(final T[] array, final T valueToSearch) {
		for (T t : array) {
			if (t == valueToSearch || valueToSearch != null && valueToSearch.equals(t)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * Recursive method to search element
	 * 
	 * @param array
	 * @param l
	 * @param r
	 * @param value
	 * @return returns index of found element
	 */
	private static <T> int recursiveLinearSearch(final T[] array, int l, int r, final T value) {
		if (r < l)
			return -1;
		if (array[l] == value)
			return l;
		if (array[r] == value)
			return r;
		return recursiveLinearSearch(array, l + 1, r - 1, value);
	}

	/**
	 * BInary Search to find element present in array
	 * 
	 * @param array
	 * @param valueToSearch
	 * @return index of the element found
	 */
	private static int binarySearch(final int[] array, final int valueToSearch) {
		int min = 0;
		int max = array.length - 1;

		while (max >= min) {
			int guess = (min + max) / 2;
			if (valueToSearch == array[guess])
				return guess;
			else if (array[guess] > valueToSearch)
				max = guess - 1;
			else
				min = guess + 1;
		}
		return -1;
	}

}
