package com.leetcode.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeCharactersInString {
	 public static String frequencySortUsingList(String s) {
	        
	        Map<Character, Integer> map = new HashMap<>();
	        for(char c: s.toCharArray()){
	            map.put(c, map.getOrDefault(c,0)+1);
	        }
	        
	        ArrayList<Character>[] bucket = new ArrayList[s.length()+1];
	        for(Character x:map.keySet()) {
	        	if( bucket[map.get(x)] == null) bucket[map.get(x)]= new ArrayList<>();
	        	bucket[map.get(x)].add(x);
	        }
	        
	        StringBuilder result = new StringBuilder();
	        for(int i= bucket.length-1;i>=0;i--) {
	        	if(null == bucket[i]) continue;
	        	for(char c: bucket[i]) {
	        		int freq = i;
	        		while(freq!= 0) {
	        			result.append(c);
	        			freq--;
	        		}
	        	}
	        }
	        
	        return result.toString();
	        
	    }
	 
	 public static String frequencySortUsingPriorityQueue(String ans) {
		 Map<Character, Integer> map = new HashMap<>();
	        for(char c: ans.toCharArray()){
	            map.put(c, map.getOrDefault(c,0)+1);
	        }
	        
	       PriorityQueue<Map.Entry<Character, Integer>>pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
	       pq.addAll(map.entrySet());
	       
	       StringBuilder res = new StringBuilder();
	       while(!pq.isEmpty()) {
	    	   Map.Entry<Character, Integer> mappy = pq.poll();
	    	   int val = mappy.getValue();
	    	   while(val != 0) {
	    		   res.append(mappy.getKey());
	    		   val --;
	    	   }
	    	   
	       }
	       
	       return res.toString();
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frequencySortUsingList("aabbbcc"));
		System.out.println(frequencySortUsingPriorityQueue("aaabbbccdeeeee"));
	}

}
