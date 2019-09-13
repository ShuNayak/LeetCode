package com.google.interview;

public class GoogleInt5 {
	
	 public boolean isPalindrome(String s) {
	        boolean res=false;
	        if(s == null || s.isEmpty() || s.length() == 1){
	            return true;
	        }
	        s=s.replaceAll("\\W","");
	        if(s == null || s.isEmpty() || s.length() == 1){
	            return true;
	        }
	        int i =0;
	        int j = s.length()-1;
	        s = s.toLowerCase();
	        char[] arr = s.toCharArray();
	        while(i<j){
	            if(arr[i]==arr[j]){
	                i++;
	                j--;
	                res = true;
	            }
	            else{
	                res = false;
	               break;
	            }
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 GoogleInt5 g = new GoogleInt5();
System.out.println(g.isPalindrome("a."));
	}

}
