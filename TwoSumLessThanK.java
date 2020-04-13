package com.leetcode.google;

import java.util.Arrays;

public class TwoSumLessThanK {

	public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int i=0;
        int j=A.length-1;
        int maxSum =-1;
        while(i<j){
            if(A[i]+A[j] >=K )j--;
            else if(A[i]+A[j]<K){
                maxSum = Math.max(maxSum, A[i]+A[j]);
                i++;
            }
        }
        return maxSum;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
