package arrays.easy;

/**
 * Check if the Array is Sorted I
 * =================================
 * Given an array arr of size n, the task is to check if the given array is
 * sorted in (ascending / Increasing / Non-decreasing) order. If the array is
 * sorted then return True, else return False.
 */

public class CheckArraySorted {
	/**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
	public static boolean isSorted(int[] arr , int n) {
		for(int i = 0; i < n-1; i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 3, 23, 2, 1};
		
		int[] arr1 = {1, 3, 5, 7, 9};
		System.out.println(isSorted(arr, arr.length));
		
		System.out.println(isSorted(arr1, arr1.length));
	}

}
