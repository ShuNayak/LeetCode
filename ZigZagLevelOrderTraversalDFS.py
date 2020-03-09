# -*- coding: utf-8 -*-
"""
Created on Mon Mar  9 11:23:09 2020

@author: shubh
"""

from typing import List
import collections
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        
class solution:
    def ZigZagDFS(self, root:TreeNode):
        res = []
        if not root:
            levels =[]
            res.append(levels)
            return res
        
        def dfs(root:TreeNode, level):
            if(level >= len(res)):
                deq = collections.deque([root.val])
                res.append(deq)
            else:
                if level%2 ==0:
                    res[level].append(root.val)
                else:
                    res[level].appendleft(root.val)
                
            if root.left:
                dfs(root.left,level+1)
            if root.right:
                dfs(root.right, level+1)
        dfs(root,0)
        return res

traverse = solution()
root = TreeNode(1)
two = TreeNode(2)
three = TreeNode(4)
four = TreeNode(5)
five = TreeNode(6)
root.left = two
root.right = four
two.left= three
four.right= five
for item in traverse.ZigZagDFS(root):
    print(item)

        
    
            
        