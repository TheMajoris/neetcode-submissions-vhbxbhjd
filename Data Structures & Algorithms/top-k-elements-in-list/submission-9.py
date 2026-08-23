from collections import defaultdict

# Firstly, make a Hashmap, and have the key as the count, and the numbers in which the count corrosponds to as the value
# Second, for every number, count no. occurences, then when done, put the number into the hashmap
# Get k amount of the most frequent elements

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        occurences = defaultdict()
        occurences2 = defaultdict(list)
        result = []

        for num in nums:
            if num not in occurences:
                occurences[num] = 1
            else:
                occurences[num] += 1
        
        for num, count in occurences.items():
            occurences2[count].append(num)
        
        for count in range(len(nums), 0, -1):
            if occurences2[count]:
                result.extend(occurences2[count])
            if len(result) >= k:
                break
        return result[:k]