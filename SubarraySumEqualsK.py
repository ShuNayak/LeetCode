from typing import List
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        numMap ={0:1}
        result =0
        cum_sum=0
        for i in range(len(nums)):
            cum_sum+=nums[i]
            if (cum_sum-k) in numMap:
                result+=numMap[cum_sum-k]
            numMap[cum_sum] = numMap.get(cum_sum,0)+1
        return result

obj = Solution()
nums = [1,1,1]
print(obj.subarraySum(nums,2))