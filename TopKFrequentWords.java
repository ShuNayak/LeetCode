package com.leetcode.google;
import java.util.*;

public class TopKFrequentWords {
	public static String[] output(String[] words, String[] frequentWords) {
		Map<String, Integer> map = new HashMap<>();
		List<String> res = new ArrayList<>();
		
	for(String s: words) {
		for(String ss: frequentWords) {
			if (s.indexOf(ss) != -1) {
				map.put(ss, map.getOrDefault(ss, 0)+1);
			}
		}
	}
	map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEachOrdered(x->res.add(x.getKey()));
			
	String[] results = new String[frequentWords.length];
	results = res.toArray(results);
	return results;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String[] arr = output(new String[] {"I love my cat, my cat is beautiful", "my dog barks at cats","cat eats bread","cat hates elephant"},new String[] {"cat","dog","bread","elephant"});
	for(String x: arr)
		System.out.println(x);
	}

}
