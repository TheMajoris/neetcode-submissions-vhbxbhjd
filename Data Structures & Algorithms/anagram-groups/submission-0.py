from collections import Counter

# First, choose a string from strs, put it in a HashMap
# Secondly, loop through the entire strs list, and if the Counter() of str1 matches the string it's comparing to, add it to the List
# When the list is exhausted, then add it onto the result list of lists, and keep iterating until they are all in their own

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []

        used = []

        for string1 in strs:
            if string1 not in used:
                temp = []
                temp.append(string1)
                used.append(string1)
                for string2 in strs:
                    if string2 not in used: 
                        if Counter(string1) == Counter(string2):
                            temp.append(string2)
                            used.append(string2)
                result.append(temp)

        return result