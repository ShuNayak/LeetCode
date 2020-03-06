# -*- coding: utf-8 -*-
"""
Created on Fri Mar  6 00:31:47 2020

@author: shubh
"""

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if not root:
            return True
        def helper(root1, root2):
            if not root1 and not root2:
                return True
            elif not root1 or not root2:
                return False
            else:
                return (root1.val == root2.val) and (helper(root1.left, root2.right) and helper(root1.right,root2.left))
        return helper(root,root)
    
root = TreeNode(1)
two = TreeNode(2)
three = TreeNode(4)
four = TreeNode(2)
five = TreeNode(3)
root.left = two
root.right = four
two.left= three
four.right= five

check = Solution()
if check.isSymmetric(root):
    print("Symmetric")
else:
    print("Not Symmetric")