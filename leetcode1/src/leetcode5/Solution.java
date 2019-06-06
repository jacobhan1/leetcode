package leetcode5;

import java.util.ArrayList;

public class Solution {
	public static String longestPalindrome(String s) {
	    int length = s.length();
	    boolean[][] P = new boolean[length][length];
	    int maxLen = 0;
	    String maxPal = "";
	    for (int len = 1; len <= length; len++) //�������еĳ���
	        for (int start = 0; start < length; start++) {
	            int end = start + len - 1;
	            if (end >= length) //�±��Ѿ�Խ�磬��������ѭ��
	                break;
	            P[start][end] = (len == 1 || len == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end); //����Ϊ 1 �� 2 �ĵ����ж���
	            if (P[start][end] && len > maxLen) {
	                maxPal = s.substring(start, end + 1);
	            }
	        }
	    return maxPal;
    }
	

}
