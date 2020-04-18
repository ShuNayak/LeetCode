package com.leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoElements(int[] arr, int target) {
		int[] res= new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int x=0;x<arr.length;x++) {
			if(map.containsKey(target-arr[x])) {
				res[0]=x;
				res[1]=map.get(target-arr[x]);
				break;
			}
			else {
				map.put(arr[x], x);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] response = twoElements(new int[] {2,5,1,9,4,3},7);
	for(int y: response) {
		System.out.println(y);
	}
	}

}
