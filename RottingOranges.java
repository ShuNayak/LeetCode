package com.leetcode.google;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class RottingOranges {
	public static class Oranges{
		int x;
		int y;
		int layer;
		public Oranges(int x, int y, int layer) {
			this.x =x;
			this.y= y;
			this.layer = layer;
		}
	}
	
	public static int rottingTime(int[][] grid) {
		Queue<Oranges> q = new LinkedList<>();
		int[] xdir = new int[] {0,0,1,-1};
		int[] ydir = new int[] {1,-1,0,0};
		 //adding all the rotten oranges to begin with
		for( int i=0;i<grid.length;i++)
			for(int j=0;j<grid[i].length;j++)
			{
				if(grid[i][j] == 2) 
					q.add(new Oranges(i, j, 0));
			}
		
		int result =0; // this will be updated each time
		while ( !q.isEmpty()) {
			Oranges o = q.poll();
			
			result = Math.max(result, o.layer);
			
			for(int h =0;h<xdir.length;h++) {
				int xx = xdir[h]+o.x;
				int yy = ydir[h]+o.y;
				
				if(isInside(xx, yy, grid) && grid[xx][yy] == 1) {
					q.add(new Oranges(xx, yy, o.layer+1));
					grid[xx][yy] = 2;
				}
			}
			
			
		}
		
		for(int ii=0;ii<grid.length;ii++)
			for(int jj=0;jj<grid[ii].length;jj++)
				if(grid[ii][jj] == 1)
					return -1;
		
		return result;
	}
	public static boolean isInside(int i, int j, int[][] grid) {
		if(i>=0 && i<grid.length && j>=0 && j<=grid[i].length-1 ) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] {{2,1,1},{2,0,1},{1,1,2}};
		System.out.println(rottingTime(arr));

	}

}
