package com.google.interview;

public class GoogleInt4 {
	   public char[] reverseWords(char[] s) {
	        String origString = new String(s);
	        String[] parts = origString.split(" ",0);
	        int i=0;
	        int j = parts.length -1;
	        String temp;
	        while(i<j){
	           temp = parts[j];
	            parts[j] = parts[i];
	            parts[i]=temp;
	            j--;
	            i++;
	        }
	        int spaceCount = 0, l =0;
	        StringBuilder b = new StringBuilder();
	        while(l<parts.length){
	            b.append(parts[l++]);
	            if(spaceCount < parts.length){
	            b.append(" ");
	            spaceCount++;
	            }
	        }
	        return b.toString().toCharArray();
	    }
	   
	   public static void main(String[] args) {
		   GoogleInt4 g = new GoogleInt4();
		   char[] c =  {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		  System.out.println(g.reverseWords(c));
	   }
}
