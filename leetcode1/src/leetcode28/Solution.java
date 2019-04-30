package leetcode28;

public class Solution {
	public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) {
		return haystack.indexOf(needle);
        }else
        	return -1;
    }
	public static int strStrs(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;
		      if (i + j == haystack.length()) return -1;
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;
		    }
		  }
		}
	
}
