package com.leetcode.google;

public class MedianOfTwoSortedArrays {

	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int lenNums1= nums1.length;
	        int lenNums2 = nums2.length;
	        
	        if(lenNums1 > lenNums2){
	            return findMedianSortedArrays(nums2,nums1);
	        }
	        
	        int unionLen = (lenNums1+lenNums2+1)/2;
	        int low =0;
	        int high = lenNums1;
	        while(low<=high){
	            int num1Count = (low+high)/2;
	            int num2Count = unionLen - num1Count;
	            
	            int maxX = (num1Count == 0)?Integer.MIN_VALUE:nums1[num1Count-1];
	            int minX = (num1Count == lenNums1)?Integer.MAX_VALUE:nums1[num1Count];
	            int maxY =  (num2Count == 0)?Integer.MIN_VALUE:nums2[num2Count-1];
	            int minY = (num2Count == lenNums2)?Integer.MAX_VALUE:nums2[num2Count];
	            
	            if(maxX<=minY && maxY<=minX){
	                if((lenNums1+lenNums2)%2 ==0){
	                    return(double)(Math.max(maxX, maxY)+Math.min(minX,minY))/2;
	                }
	                else{
	                    return Math.max(maxX, maxY);
	                }
	            }
	            if(maxX>minY){
	                high = num1Count-1;
	            }else if(maxY>minX){
	                low=num1Count+1;
	            }
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {12,13,45,67,88};
		int[] brr = new int[] {9,6,135,189,302};
		System.out.println(findMedianSortedArrays(arr, brr));

	}

}
