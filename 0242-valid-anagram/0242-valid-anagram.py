class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
       
        if len(s) != len(t):
            return False
        
        hashmap = {}
        
        for ch in s:
            hashmap[ch] = hashmap.get(ch, 0) + 1

        for ch in t:
            if ch not in hashmap:
                return False
            hashmap[ch] -= 1

            if hashmap[ch] < 0:
                return False

        return True
