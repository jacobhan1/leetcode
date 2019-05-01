package leetcode35;

public class Solution {
	 public static int searchInsert(int[] nums, int target) {
		 if (nums.length == 0) {
			 return 0;
		 }else if(target > nums[nums.length -1]) {return nums.length;}
		 int low = 0;
		 int high = nums.length;
		 int mid = (high - low)/2;
		 while (low <= high) {
			 if (nums[mid] < target) {
				 low = mid + 1;
				 mid = (low + high)/2;
				 
			 }else if (nums[mid] == target) {
				 return mid;
			 }else if (nums[mid] > target) {
			 high = mid - 1;
			 mid = high/2;
			 }
		 }
			 return low;
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = new int[] {1,3,5,7,9};
		 System.out.println(searchInsert(nums, 10));
	 }
}
