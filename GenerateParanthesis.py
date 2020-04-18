# -*- coding: utf-8 -*-
"""
Created on Sat Mar 28 12:07:50 2020

@author: shubh
"""

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        output =[]
        
        def generateRecursion(output:List[str], current:str, openn:int, close:int, maxx:int):
            if len(current)==maxx*2:
                output.append(current)
                return
            if openn<maxx:
                generateRecursion(output, current+"(", openn+1, close, maxx)
            if close<openn:
                generateRecursion(output, current+")", openn, close+1, maxx)
        generateRecursion(output, "", 0, 0, n);
        return output