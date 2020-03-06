package com.leetcode.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressiveWords {

	

	 public static int expressiveWords(String S, String[] words) {
	        Expressive stretchy = new Expressive(S);
	        int ans =0;
	        search:for(String word: words){
	            Expressive wordy = new Expressive(word);
	            if(!stretchy.key.equals(wordy.key)) continue;
	            for(int i =0;i<stretchy.result.size();i++){
	                if((stretchy.result.get(i)!= wordy.result.get(i) && stretchy.result.get(i)<3) || stretchy.result.get(i)<  wordy.result.get(i)) continue search;
	            }
	            ans++;
	            
	        }
	        return ans;
	    }
	 
	 public static void main(String[] args) {
		 ExpressiveWords.expressiveWords("Heeellooo", new String[] {"Hello","Hi"});
	 }
	    
	}

	class Expressive{
	    String key;
	    List<Integer> result;
	    
	    public Expressive(String s){
	        this.result = new ArrayList<>();
	        int prev = -1;
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            if(i==s.length()-1 || s.charAt(i) != s.charAt(i+1)){
	               sb.append(s.charAt(i));
	                result.add(i-prev);
	                prev =i;
	            }
	        }
	        this.key = sb.toString();
	    }
	    
	}
