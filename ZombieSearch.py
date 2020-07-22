from typing import List
import collections
class Solution:
    def makeZombie(self, grid: List[List])->int:
        if grid is None or len(grid)==0:
            return -1
        human  = 0
        zombie = collections.deque()
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]==0:
                    human+=1
                else:
                    zombie.append((i,j))
        hours = 0
        while zombie:
            for _ in range(len(zombie)):
                value_x, value_y = zombie.popleft()
                for x, y in [(value_x,value_y+1),(value_x, value_y-1),(value_x+1, value_y),(value_x-1,value_y)]:
                    if 0<=x<len(grid) and 0<=y<len(grid[0]):
                        if grid[x][y]==0:
                            grid[x][y]=1
                            human-=1
                            zombie.append((x,y))

            hours+=1

        return max(0, hours-1) if human==0 else -1
obj = Solution()
print(obj.makeZombie([[0,1,1],[0,1,0],[0,0,0]]))