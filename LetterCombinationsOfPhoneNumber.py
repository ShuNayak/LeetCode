# -*- coding: utf-8 -*-
"""
Created on Wed Mar 25 22:43:02 2020

@author: shubh
"""
from typing import List
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        res =[]
        letters = [0,1,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
        if not digits or len(digits)==0:
            return res
        res.append("")
        
        for i in range(len(digits)):
            index = int(digits[i])
            while len(res[0])==i:
                permutation = res[0]
                del res[0]
                for j in range(len(letters[index])):
                    res.append(permutation+letters[index][j])
        return res

digits = "23"
obj = Solution()
print(obj.letterCombinations(digits))