class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_sorted = sorted(s)
        t_sorted = sorted(t)

        for i in range(min(len(s), len(t))):
            if(s_sorted[i] != t_sorted[i]):
                return False

        return True