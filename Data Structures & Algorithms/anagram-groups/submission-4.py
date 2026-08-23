from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anagram_map = defaultdict(list)
        for s in strs:
            key = "".join(sorted(s))     # signature
            anagram_map[key].append(s)   # auto-groups
        return list(anagram_map.values())