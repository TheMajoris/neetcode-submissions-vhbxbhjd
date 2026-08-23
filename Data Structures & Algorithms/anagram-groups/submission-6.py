from collections import defaultdict, Counter

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = defaultdict(list)         # new HashMap
        for s in strs:
            counts = [0] * 26

            for char in s:                      # Make the key with the count of each character
                index = ord(char) - ord('a')    # Get the index, ascii subtraction (eg. c - 'a' = 2)
                counts[index] += 1              # Increment the count for that character
            
            signature = tuple(counts)           # Make the list into a tuple (which can be hashed)

            anagram_map[signature].append(s)
        
        return list(anagram_map.values())       # returning a list of the VALUES portion of the hashmap (not key)