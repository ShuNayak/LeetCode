# -*- coding: utf-8 -*-
"""
Created on Fri Mar  6 12:30:09 2020

@author: shubh
"""
from typing import List
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        levels = []
        
        if not root:
            return levels
        def helper(node:TreeNode, level):
            if len(levels) == level:
                levels.append([])
            
            levels[level].append(node.val)
            if node.left:
                helper(node.left,level+1)
            if node.right:
                helper(node.right, level+1)
        helper(root,0)
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
for item in traverse.levelOrder(root):
    print(item)