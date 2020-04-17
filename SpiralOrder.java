package com.leetcode.google;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> res = new ArrayList<>();
	        if( null ==  matrix || matrix.length == 0) return res;
	        
	        int left =0;
	        int right = matrix[0].length-1;
	        int top =0;
	        int bottom = matrix.length-1;
	        int max = matrix.length*matrix[0].length;
	        
	        while(res.size() <max){
	            for(int i=left;i<=right && res.size() <max;i++)
	                res.add(matrix[top][i]);
	            top++;
	            for( int i = top;i<=bottom && res.size() <max;i++)
	                res.add(matrix[i][right]);
	            right--;
	            for(int i=right;i>=left && res.size() < max;i--)
	                res.add(matrix[bottom][i]);
	            bottom--;
	            for(int i= bottom;i>=top && res.size() < max;i--)
	                res.add(matrix[i][left]);
	            left++;
	        }
	        
	        return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
