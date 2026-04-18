package basic.language;

public class SumOfFirstLastArray {
	/**
	 * Given an integer array nums, return the sum of
	 * the 1st and last element of the array.
	 */
	
	public void sumElements(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		
		int result = first + last;
		
		System.out.println("Sum of first and last: " + result);
	}
}
