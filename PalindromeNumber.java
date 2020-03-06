package com.leetcode.google;

public class PalindromeNumber {

	 public static boolean isPalindrome(int x) {
	      
	        int y =x;
	        if(y<0) return false;
	        int rem =0;
	        while(y!=0){
	            rem = rem*10+y%10;
	            y= y/10;
	        }
	        
	        return (rem==x);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome(121));
	}

}
