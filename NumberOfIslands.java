package com.leetcode.google;

public class NumberOfIslands {

	public static int numberOfIslands(char[][] grid) {
		
		if (null == grid || grid.length == 0) return 0;
		int num =0;
		
		for (int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
 				if(grid[i][j] == '1') {
					num+=dfs(grid, i,j);
				}
			}
		}
		return num;
		
	}
	
	
	
	private static int dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if(i<0 || i>=grid.length|| j<0 ||j>=grid.length||grid[i][j]=='0') return 0;
		grid[i][j]='0';
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		return 1;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char[][] grid = new char[][] {{'0','0','1'},{'1','0','0'},{'1','1','0'}};
      System.out.println(numberOfIslands(grid));
	}

}
