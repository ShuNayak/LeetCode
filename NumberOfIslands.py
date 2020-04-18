# -*- coding: utf-8 -*-
"""
Created on Sun Mar 15 14:52:30 2020

@author: shubh
"""
import collections
from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]):
        
        def dfs(grid:List[List[str]],i,j):
            if i<0 or i>=len(grid) or j<0 or j>=len(grid[i]) or grid[i][j]=='0':
                return 0
            grid[i][j]='0'
            dfs(grid,i-1,j)
            dfs(grid,i+1,j)
            dfs(grid,i,j-1)
            dfs(grid,i,j+1)
            return 1
        
        
        if not grid or len(grid)==0:
            return 0
        num =0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                num+=dfs(grid,i,j)
        return num
    
myList = []
myList.append(['1','1','1','0'])
myList.append(['0','0','0','1'])
myList.append(['1','0','0','1'])
check = Solution()
print(check.numIslands(myList))
    
