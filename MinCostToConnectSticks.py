import heapq
from typing import  List
class Solution:
    def connectSticks(self, sticks: List[int]) -> int:
        # adding the elements to the heap
        heapq.heapify(sticks)
        min = 0

        while len(sticks) >= 2:
            first = heapq.heappop(sticks)
            second = heapq.heappop(sticks)
            min += first + second
            heapq.heappush(sticks, first + second)
        return min

obj = Solution()
print(obj.connectSticks([2,3,4]))