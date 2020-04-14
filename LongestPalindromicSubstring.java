package com.leetcode.google;

public class LongestPalindromicSubstring {
	public static String longestPlainString(String str) {
		if(null == str || str.length() ==0) return "";
		String temp = str.substring(0,1);
		for(int i=0;i<str.length();i++) {
			if(temp.length()<expand(i, i, str).length())
				temp = expand(i, i, str);
			if(temp.length() < expand(i, i+1, str).length())
				temp = expand(i, i+1, str);
		}
		return temp;	
		
	}
	
	public static String expand(int start, int end, String str) {
		while(start>=0 && end<=str.length()-1 && str.charAt(start) == str.charAt(end))
		{
			start--;
			end++;
		}
		return str.substring(start+1, end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestPlainString("BANANA"));
	}

}
