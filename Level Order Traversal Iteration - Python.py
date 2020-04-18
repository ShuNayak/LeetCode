# -*- coding: utf-8 -*-
"""
Created on Fri Mar  6 13:32:11 2020

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
        
class Solution:
    def LevelOrderTraversal(self, root:TreeNode)->List[List[int]]:
        levels =[]
        if not root:
            return levels
        
        deq = collections.deque([root])
        level =0
        while deq:
            levels.append([])
            length = len(deq)
            for i in range(length):
                Node = deq.popleft()
                levels[level].append(Node.val)
                
                if Node.left:
                    deq.append(Node.left)
                if Node.right:
                    deq.append(Node.right)
                
            level+=1
            
        return levels
    
root = TreeNode(1)
two = TreeNode(2)
three = TreeNode(4)
four = TreeNode(5)
five = TreeNode(6)
root.left = two
root.right = four
two.left= three
four.right= five

traverse = Solution()
for item in traverse.LevelOrderTraversal(root):
    print(item)
        