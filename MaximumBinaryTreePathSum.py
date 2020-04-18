# -*- coding: utf-8 -*-
"""
Created on Mon Mar  9 14:23:38 2020

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
    def maxBTPathSum(self, root:TreeNode)->int:
        maxPath = float('-inf')
        
        if not root:
            return 0
        def innerBTPathSum(root:TreeNode):
            nonlocal maxPath
            
            if not root:
                return 0
            leftGain = max(0,innerBTPathSum(root.left))
            rightGain = max(0, innerBTPathSum(root.right))
            maxPath = max(maxPath, leftGain+rightGain+root.val)
            return max(leftGain, rightGain)+root.val
        
        innerBTPathSum(root)
        return maxPath
    

root = TreeNode(1)
two = TreeNode(2)
three = TreeNode(4)
four = TreeNode(5)
five = TreeNode(6)
root.left = two
root.right = four
two.left= three
four.right= five
traverse = solution()

print(traverse.maxBTPathSum(root))