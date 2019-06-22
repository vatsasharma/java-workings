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
	private static <T> int recursiveLinearSearch(T[] array, int l, int r, T value) {
		if (r < l)
			return -1;
		if (array[l] == value)
			return l;
		if (array[r] == value)
			return r;
		return recursiveLinearSearch(array, l + 1, r - 1, value);
	}

}
