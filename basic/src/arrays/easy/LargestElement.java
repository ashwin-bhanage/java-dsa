package arrays.easy;

import java.util.Arrays;

/*
 * Largest Element
 * ==================
 * Given an array of integers nums, return the value of the largest element in
 * the array
 */

public class LargestElement {
	
	public static int largestElementByMinValue(int[] nums) {
		int largest = Integer.MIN_VALUE;
		
		for(int num: nums) {
			if (num > largest) {
				largest = num;
			}
		}
		
		return largest;
	}
	
	
	public static int largestElementbyArrays(int[] nums) {
		
		Arrays.sort(nums);
		
		return nums[nums.length - 1];
	}
	
	
	public static void main(String[] args) {
		int[] nums = {3, 1, 4, 1, 5, 9};
		System.out.println("ArraySort Method: " + largestElementbyArrays(nums));
		System.out.println("MinValue Method: " + largestElementByMinValue(nums)); // Output: 9
	}
}
