# -*- coding: utf-8 -*-
"""
Created on Wed Mar 11 00:36:22 2020

@author: shubh
"""

import collections
from collections import defaultdict

def ladderLength(beginWord:str, endWord:str,wordList:list)->int:
    if not beginWord or not endWord or not wordList or not endWord in wordList:
        return 0
    L = len(beginWord)
    allDict = defaultdict(list)
    
    for word in wordList:
        for i in range(L):
            intermediate = word[:i]+"*"+word[i+1:]
            allDict[intermediate].append(word)
            
    
    queue = collections.deque([(beginWord, 1)])
    visited  = {beginWord:True}
    
    while queue:
        currentWord, level = queue.pop();
        for i in range(L):
            intermediate = currentWord[:i]+"*"+currentWord[i+1:]
            
            for word in allDict[intermediate]:
                if word == endWord:
                    return level+1
                if word not in visited:
                    visited[word]= True
                    queue.append((word, level+1))
            allDict[intermediate] = []
    return 0

beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log","cog"]
print(ladderLength(beginWord,endWord,wordList))
            
            
    