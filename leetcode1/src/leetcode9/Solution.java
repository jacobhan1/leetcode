package leetcode9;

public class Solution {

	public static boolean isPalindrome(int x) {
		int result = 0;
		int origin = x;
		if(x < 0) {
			return false;
		}else if(x == 0){return true;}
		while(x > 0) {
			int res = x % 10;
			int newResult = result*10 + res;
			result = newResult;
			x = x/10;
		}
		return (result == origin);
	}
	

}
