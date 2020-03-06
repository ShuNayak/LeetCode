# -*- coding: utf-8 -*-
"""
Created on Sat Feb 29 11:09:41 2020

@author: shubh
"""
class TreeNode:
     def __init__(self, data):
        self.data= data
        self.left= None
        self.right = None
    
def isMirror(root1:TreeNode, root2:TreeNode)->bool:
    if not root1 and not root2:
        return True
    if not root1 or not root2:
        return false
    return (root1.data == root2.data) and isMirror(root1.left,root2.right) and isMirror(root1.right, root2.left)
    

rootOne = TreeNode(1)
roottwo = TreeNode(1)
three = TreeNode(3)
four = TreeNode(4)
five = TreeNode(5)
six = TreeNode(3)
seven = TreeNode(4)
eight = TreeNode(5)

rootOne.left = three
rootOne.right = five
three.left = four

roottwo.left = eight
roottwo.right = six
six.right = seven

if isMirror(rootOne, roottwo):
    print(True)
else:
    print(False)


        



