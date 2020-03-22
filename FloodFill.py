# -*- coding: utf-8 -*-
"""
Created on Sun Mar 22 16:32:05 2020

@author: shubh
"""

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        if not image or image[sr][sc] == newColor:
            return image
        def fill(image:List[List[int]], sr:int,sc:int, oldColor:int, newColor:int):
            if sr<0 or sr>=len(image) or sc<0 or sc>=len(image[sr]) or image[sr][sc]!=oldColor:
                return
            image[sr][sc]=newColor
            fill(image,sr,sc+1,oldColor,newColor )
            fill(image,sr,sc-1,oldColor,newColor )
            fill(image,sr+1,sc,oldColor,newColor )
            fill(image,sr-1,sc,oldColor,newColor )
            
        oldColor = image[sr][sc]
        fill(image, sr, sc, oldColor, newColor)
        return image
        
       