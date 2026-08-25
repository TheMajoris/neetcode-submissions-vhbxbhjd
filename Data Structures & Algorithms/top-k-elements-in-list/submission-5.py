from collections import defaultdict

# Firstly, make a Hashmap, and have the key as the count, and the numbers in which the count corrosponds to as the value
# Second, for every number, count no. occurences, then when done, put the number into the hashmap
# Return the list(occurences) 

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        occurences = defaultdict(list)

        for num in nums:
            if(num.value() not in occurences):
                occurences[nums.count(num)].append(num)
        
        k-=1
        
        listOf = list(occurences.values())[k:]
        
        combined = []
        for sublist in listOf:
            combined.extend(sublist)
        
        return combined
