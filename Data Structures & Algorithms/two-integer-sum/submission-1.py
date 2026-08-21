from collections import Counter

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freq = {}
        for i, x in enumerate(nums):
            comp = target - x
            if comp in freq:
                return [freq[comp], i]
            freq[x] = i