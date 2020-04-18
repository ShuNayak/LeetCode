package com.leetcode.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReorderLogFiles {
	 public static String[] reorder(String[] logs) {
	      Comparator<String> compr = new Comparator<String>(){
	          public int compare(String s1, String s2){
	              String[] s1Parts = s1.split(" ",2);
	              String[] s2Parts = s2.split(" ",2);
	              boolean isDigit1 = Character.isDigit(s1Parts[1].charAt(0));
	              boolean isDigit2 = Character.isDigit(s2Parts[1].charAt(0));
	              if(!isDigit1 && !isDigit2){
	                  int comp = s1Parts[1].compareTo(s2Parts[1]);
	                  if(comp !=0) return comp;
	                  return s1Parts[0].compareTo(s2Parts[0]);
	              }
	              
	              else if(isDigit1 && !isDigit2)return 1;
	              else if (!isDigit1 && isDigit2)return -1;
	              else return 0;
	              
	          }
	      };
	        
	        Arrays.sort(logs, compr);
	        return logs;
			
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reorder(new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"}));

	}

}
