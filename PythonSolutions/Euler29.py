import math


class Solution:
    def Euler29(self):
        minA = 2
        maxA = 100
        minB = 2
        maxB = 100
        terms = set()
        for x in range(minB, maxB + 1):
            for y in range(minA, maxA + 1):
                terms.add(pow(y, x))
        print(len(terms))


s = Solution()
s.Euler29()
