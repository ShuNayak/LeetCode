package com.leetcode.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quadruplet {

	public static int[] findArrayQuadruplet(int[] arr, int s) {
	    // your code goes here
	    //considering the similarity to the 3 sum problem
	    
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length-1;i++){
	     if(i==0||i>0 && arr[i]!= arr[i-1]){
	     int sum = s- arr[i];
	      for(int j=i+1;j<arr.length;j++){
	        int partSum = sum-arr[j];
	        int low = j+1;
	        int high = arr.length-1;
	        while(low <high){
	          if(arr[low]+arr[high] == partSum){
	            int[] x = new int[]{arr[i],arr[j],arr[low],arr[high]};
	          
	          return x;
	            
	          }
	          else if(arr[low]+arr[high] < partSum)low++;
	          else high--;
	        }
	      }
	      
	      
	    }
	    }
	    return new int[] {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=findArrayQuadruplet(new int[] {2, 7, 4, 0, 9, 5, 1, 3}, 20);
		for(int val:x) {
			System.out.println(val);
		}

	}

}
