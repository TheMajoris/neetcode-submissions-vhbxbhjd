class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count = {}
        idx = 0
        for i in s:
            if(i in count):
                count[i] += 1
                idx += 1
            else:
                count[i] = 1
                idx += 1

        for j in t:
            if(j in count and count[j] >= 0):
                count[j] -= 1
                idx -= 1
            else:
                return False

        if idx != 0:
            return False
        return True

        