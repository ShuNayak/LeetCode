from typing import  List
import collections
class solution:
    def timeNeeded(self, n:int, headID:int, manager:List[int], informTime:List[int])->int:
        managerDict = collections.defaultdict(list)

        #populate the subordinates
        for i in range(len(manager)):
            if manager[i]!= -1:
                managerDict[manager[i]].append(i)

        queue = collections.deque()
        queue.append([headID,informTime[headID]])
        min =0
        while queue:
            size= len(queue)
            for i in range(size):
                temp = queue.pop()
                min = max(min, temp[1])
                for items in managerDict[temp[0]]:
                    if items:
                        queue.append([items, informTime[items]+temp[1]])
        return min

obj = solution()
print(obj.timeNeeded(15,0,[-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6],[1,1,1,1,1,1,1,0,0,0,0,0,0,0,0]))
