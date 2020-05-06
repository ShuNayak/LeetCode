package com.leetcode.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
	
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
	        
	        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
	        int[][] res = new int[intervals.length][2];
	        
	        int i=0;
	        int j=0;
	        while(i<intervals.length && intervals[i][1]<newInterval[0]){
	               res[j++]= intervals[i++];
	        }
	        
	        while(i< intervals.length && intervals[i][0]<=newInterval[1]){
	            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
	            newInterval[1] =  Math.max(intervals[i][1], newInterval[1]);
	            i++;
	        }
	        
	        res[j++] = newInterval;
	        
	        while(i<intervals.length){
	            res[j++] = intervals[i++];
	        }
	        
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] res = insert(new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}},new int[] {4,8});
		 for(int[] x: res) {
			 if(x[0]==0 && x[1] == 0) continue;
			 System.out.println("("+x[0]+","+x[1]+")");
		 }
		
	}

}
