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

}
