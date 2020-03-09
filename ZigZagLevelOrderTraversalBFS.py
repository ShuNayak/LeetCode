# -*- coding: utf-8 -*-
"""
Created on Fri Mar  6 16:09:33 2020

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
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        ret =[]
        if not root:
            return ret
        
        NodeDeq = collections.deque([root, None])
        levelList = collections.deque()
        leftOrder = True
        
        while NodeDeq:
            node = NodeDeq.popleft()
            if node:
                if leftOrder:
                    levelList.append(node.val)
                else:
                    levelList.appendleft(node.val)
                if node.left:
                    NodeDeq.append(node.left)
                if node.right:
                    NodeDeq.append(node.right)
                
            else:
                ret.append(levelList)
                if len(NodeDeq)>0:
                    NodeDeq.append(None)
                levelList = collections.deque()
                leftOrder = not leftOrder
        return ret
                    
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
for item in traverse.zigzagLevelOrder(root):
    print(item)

