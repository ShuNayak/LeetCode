package com.leetcode.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TimeNeededToInformManagers {
	 public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
	       
		 Map<Integer, ArrayList<Integer>> managerMap = new HashMap<>();
		 // populating the manager list
		 for(int i=0;i<manager.length;i++) {
			 if(manager[i]!= -1) {
				 ArrayList<Integer> arr = managerMap.getOrDefault(manager[i], new ArrayList<Integer>());
				 arr.add(i);
				 managerMap.put(manager[i], arr);
		 }
		 }
			 
			 Queue<Integer[]> q = new LinkedList<>();
			 q.offer(new Integer[] {headID, informTime[headID]});
			 int max =0;
			 while(!q.isEmpty()) {
				 int len = q.size();
				 for(int j =0;j<len;j++) {
					 Integer[] nodes = q.poll();
					 max = Math.max(max, nodes[1]);
					 ArrayList<Integer> list = managerMap.get(nodes[0]);
					 if(list != null)
					 for(int node: list) {
						 q.offer(new Integer[] {node, nodes[1]+informTime[node]});
					 }
					 
				 }
			 }
			 
			 
		 
		    
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numOfMinutes(6, 2, new int[] {2,2,-1,2,2,2}, new int[] {0,0,1,0,0,0}));

	}

}
