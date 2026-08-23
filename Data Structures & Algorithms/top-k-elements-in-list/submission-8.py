from collections import defaultdict

# Firstly, make a Hashmap, and have the key as the count, and the numbers in which the count corrosponds to as the value
# Second, for every number, count no. occurences, then when done, put the number into the hashmap
# Return the list(occurences) 

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        occurences = defaultdict()
        result = []

        for num in nums:
            if num not in occurences:
                occurences[num] = 1
            else:
                occurences[num] += 1
        
        occurencesSort = sorted(occurences, key=occurences.get, reverse=True)
        
        return occurencesSort[:k]

        
        # combined = []
        # for sublist in listOf:
        #     combined.extend(sublist)
        
        # return combined
