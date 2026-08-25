from collections import Counter

# First, choose a string from strs, put it in a HashMap
# Secondly, loop through the entire strs list, and if the Counter() of str1 matches the string it's comparing to, add it to the List
# When the list is exhausted, then add it onto the result list of lists, and keep iterating until they are all in their own

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []

        used = set()

        for x, string1 in enumerate(strs):
            if x not in used:
                temp = []
                temp.append(string1)
                used.add(x)
                for y, string2 in enumerate(strs):
                    if y not in used: 
                        if Counter(string1) == Counter(string2):
                            temp.append(string2)
                            used.add(y)
                result.append(temp)

        return result