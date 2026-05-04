package arrays.easy;

/**
 * Find Missing Number
 * =====================
 * Given an integer array of size n containing distinct values in the range
 * from 0 to n (inclusive), return the only number missing from
 * the array within this range.
 */

public class FindMissingNumber {
	
	// given is integer array of n and range o to n
	public static int findMissingNumber(int[] arr) {
		
		int n = arr.length;
		
		// calculate sum of n numbers
		int expectedSum = n * (n+1) / 2;
		
		// calculate sum of array elements
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		
		return expectedSum - actualSum;
	}
	
	public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(findMissingNumber(nums));
    }
}
