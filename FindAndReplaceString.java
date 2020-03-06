package com.leetcode.google;

import java.util.Arrays;

public class FindAndReplaceString {

	 public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
		 int[] match= new int[S.length()];
	        Arrays.fill(match, -1);
	        
	        for(int i=0;i<indexes.length;i++){
	            int ind = indexes[i];
	            if(S.substring(ind, ind+sources[i].length()).equals(sources[i])){
	                match[ind] = i;
	            }
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<match.length;){
	            if(match[i]>=0){
	                sb.append(targets[match[i]]);
	                i+= sources[match[i]].length();
	            }
	            else{
	                sb.append(S.charAt(i++));
	            }
	        }
	        return sb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findReplaceString("abcd", new int[] {0,2}, new String[] {"ab","ec"}, new String[] {"eee","ffff"}));
	}

}
