from typing import List
class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        rows = len(matrix)
        if rows == 0:
            return 0
        cols = len(matrix[0])
        ans = [[0] * (cols + 1) for j in range(rows + 1)]
        maxHeight = 0

        for i in range(1, rows + 1):
            for j in range(1, cols + 1):
                if (matrix[i - 1][j - 1] == '1'):
                    ans[i][j] = min(ans[i - 1][j], ans[i][j - 1], ans[i - 1][j - 1]) + 1
                    maxHeight = max(ans[i][j], maxHeight)
        return maxHeight ** 2

obj = Solution()
matrix = [["1"]]
print(obj.maximalSquare(matrix))