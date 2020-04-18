
from typing import List
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        if not grid or len(grid) == 0:
            return 0
        dp = [[0 for i in range(len(grid[0]))] for j in range(len(grid))]
        for i in range(len(dp)):
            for j in range(len(dp[0])):
                dp[i][j] += grid[i][j]

                if (i > 0 and j > 0):
                    dp[i][j] += min(dp[i][j - 1], dp[i - 1][j])
                elif (i > 0):
                    dp[i][j] += dp[i - 1][j]
                elif (j > 0):
                    dp[i][j] += dp[i][j - 1]

        return dp[len(dp) - 1][len(dp[0]) - 1]

soln = Solution()
arr =[[1,2,5],[3,2,1]]
print(soln.minPathSum(arr))