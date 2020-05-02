package com.leetcode.google;

public class RepeatingSubstring {
	 public boolean repeatedSubstringPattern(String s) {
	        
	        if( s == null ||s.length() ==0) return false;
	        for(int i = s.length()/2;i>=1;i--){
	            if(s.length()%i==0){
	                int q = s.length()/i;
	                String str = s.substring(0,i);
	                StringBuilder res = new StringBuilder();
	                for(int j=1;j<=q;j++)
	                    res.append(str);
	                
	                if(s.equals(res.toString())) return true;
	            }
	            
	            
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
