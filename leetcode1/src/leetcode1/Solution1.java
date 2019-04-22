package leetcode1;

public class Solution1 {

	public Solution1() {
		
	}
	public static int[] twoSum(int[] nums, int target) {
		
		int[] sum = new int[2];
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j< nums.length; j++) {
				if((nums[i] + nums[j]) == target ) {
					sum[0] = i;
					sum[1] = j;
					break;
				}
			}
		}
		return sum;
	
	}
	public static void main(String[] args) {
		int[] i = new int[]{2,5,5,1};
		int[] s  = twoSum(i, 10);
		
		for(int h =0; h< s.length; h++) {
			
			System.out.println(s[h]);
		}
			
			
		
	}
}
