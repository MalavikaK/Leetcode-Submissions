class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
    
        hashmap1 = {}
        for ch in s:
            hashmap1[ch] = hashmap1.get(ch,0) + 1

        for ch in t:
            if ch not in hashmap1: 
                return False
            hashmap1[ch] -= 1

            if hashmap1[ch] < 0 :
                return False

        return True