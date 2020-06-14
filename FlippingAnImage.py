from typing import List
class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
        for i in range(len(A)):
            self.reverseArray(A[i])
        return A

    def reverseArray(C: List[int]):
        start = 0
        end = len(C)
        while start < end:
            if C[start] == 0:
                C[start] = 1
            else:
                C[start] = 0
            if C[end] == 0:
                C[end] = 1
            else:
                C[end] = 0
            temp = C[end]
            C[start] = C[end]
            C[end] = temp
            start += 1
            end -= 1
        return

obj = Solution()
myList = obj.flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]])
print(myList)