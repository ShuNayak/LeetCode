package com.leetcode.google;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinMaxPath {

	public static int maximumMinimumPath(int[][] A) {
        
        // max heap
        PriorityQueue<Integer[]> maxHeap = new PriorityQueue<>((a,b)->(b[0]-a[0]));
        ArrayList<Integer[]> direct = new ArrayList<>();
         direct.add(new Integer[]{1,0});
         direct.add(new Integer[]{-1,0});
         direct.add(new Integer[]{0,1});
         direct.add(new Integer[]{0,-1});
        
        maxHeap.add(new Integer[] {A[0][0], 0, 0});
        int res = Integer.MAX_VALUE;
        int row = A.length;
        int col = A[0].length;
        while (!maxHeap.isEmpty()){
            Integer[] temp = maxHeap.poll();
            A[temp[1]][temp[2]]=-1;
            if( temp[0] < res)
                res = temp[0];
            if(temp[1] == row-1  && temp[2]== col-1) break;
            
            for(Integer[] path: direct){
                int x = temp[1]+path[0];
                int y = temp[2]+path[1];
                if(x>=0 && x<row && y>=0 && y<col && A[x][y] != -1)
                    maxHeap.add(new Integer[]{A[x][y],x,y});
            }
            
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
