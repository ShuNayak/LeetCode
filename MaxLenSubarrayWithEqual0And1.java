package com.leetcode.google;

import java.util.HashMap;
import java.util.Map;

public class MaxLenSubarrayWithEqual0And1 {
	public static int findMaxLength(int[] nums) {
        int sum =0;
        int maxLen =0;
        int len = nums.length;
        
       
        
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
        	if(nums[i] ==0)nums[i]=-1;
            sum += nums[i];
            
            if(sum ==0){
               maxLen = i+1;
            }
            
            if(hashMap.containsKey(sum+len)){
                if(maxLen<i-hashMap.get(sum+len)){
                    maxLen = i-hashMap.get(sum+len);
                }
            }else{
                hashMap.put(sum+len, i);
            }
            if(nums[i]==-1)nums[i]=1;
        }
        return maxLen;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMaxLength(new int[] {1,0,0,1,0,1,1,1}));

	}

}
