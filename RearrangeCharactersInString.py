import  collections
class solution:
    def rearrangeByFrequency(self, input:str)->str:
        return "".join([char * times for char,times in collections.Counter(input).most_common()])

obj = solution()
print(obj.rearrangeByFrequency("aabbbc"))

