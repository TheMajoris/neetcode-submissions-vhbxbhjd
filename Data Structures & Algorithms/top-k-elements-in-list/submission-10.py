from collections import defaultdict

# Firstly, make a Hashmap, and have the key as the count, and the numbers in which the count corrosponds to as the value
# Second, for every number, count no. occurences, then when done, put the number into the hashmap
# Get k amount of the most frequent elements

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        occurences = defaultdict()
        occurences2 = defaultdict(list)
        result = []

        for num in nums:                            # Make the hashmap nums -> frequency
            if num not in occurences:
                occurences[num] = 1
            else:
                occurences[num] += 1
        
        for num, count in occurences.items():       # Invert the hashmap frequency -> nums
            occurences2[count].append(num)
        
        for count in range(len(nums), 0, -1):       # From length n (length of the input array), to 0, get the numbers associated with that count
            if occurences2[count]:                  # Being, if you have a nums array with length 8, check if there is an element with 8 occurences, no? 
                                                    # Decrement. 7 Occurences, until you get one then add it to the list
                                                    
                result.extend(occurences2[count])   # Add it to the result
            if len(result) >= k:                    # Do we have enough? Okay, break
                break
        return result[:k]                           # Return only k elements