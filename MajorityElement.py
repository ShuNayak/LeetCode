from collections import defaultdict
import math
from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        mapp = defaultdict(lambda: 0)
        size = math.floor(len(nums) / 2)
        for number in nums:
            if mapp[number] >= size:
                return number
            mapp[number] += 1
        return -1




