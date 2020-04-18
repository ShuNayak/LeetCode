# -*- coding: utf-8 -*-
"""
Created on Sat Mar 14 13:55:58 2020

@author: shubh
"""

from typing import List
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        indegree = [0]*numCourses
        count =0
        
        for i in range(len(prerequisites)):
            indegree[prerequisites[i][0]]+=1
        
        stack = []
        for i in range(numCourses):
            if indegree[i]==0:
                stack.append(i)
        
        while stack:
            value = stack.pop()
            count+=1
            for i in range(len(prerequisites)):
                if prerequisites[i][1]==value:
                    indegree[prerequisites[i][0]]-=1
                    if indegree[prerequisites[i][0]]==0:
                        stack.append(prerequisites[i][0])
        
        if numCourses==count:
            return True
        return False

nums = 3
prerequisites =[[1,0],[2,1]]
check = Solution()
print(check.canFinish(nums,prerequisites))
