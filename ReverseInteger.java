package com.leetcode.google;

public class ReverseInteger {

	 public static int reverse(int x) {
	     
	       
	        long rem =0;
	        while(x!=0){
	           rem = rem*10+x%10;
	            x= x/10;
	        }
	        
	        if (rem>Integer.MAX_VALUE || rem< Integer.MIN_VALUE) return 0;
	        
	        return (int)rem;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse(1534236469));
	}

}
