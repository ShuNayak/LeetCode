class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""
        len1 = len(str1)
        len2 = len(str2)
        index = self.gcd(len1, len2)
        return str1[:index]

    def gcd(self, p: int, q: int) -> int:
        if q == 0:
            return p
        else:
            return self.gcd(q, p % q)

obj = Solution()
print( obj.gcdOfStrings('ABCABC','ABC'))