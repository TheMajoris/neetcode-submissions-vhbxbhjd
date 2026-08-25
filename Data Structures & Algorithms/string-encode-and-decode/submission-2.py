class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""

        for string in strs:
            result += str(len(string))
            result += "#"
            result += string

        return result

    def decode(self, s: str) -> list[str]:
        result = []
        i = 0
        
        while i < len(s):
            # 1. Find the '#' delimiter
            j = i
            while s[j] != '#':
                j += 1
                
            # 2. Get the length of the next string
            # i is the start of the number, j is where the '#' is
            length = int(s[i:j])
            
            # 3. Extract the actual string using the length
            # It starts right after the '#' (j + 1)
            string = s[j + 1 : j + 1 + length]
            result.append(string)
            
            # 4. Move the pointer to the start of the next encoded string
            i = j + 1 + length
            
        return result