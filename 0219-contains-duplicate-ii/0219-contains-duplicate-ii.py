class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        Hashmap = {}

        for i, num in enumerate(nums):
            if num in Hashmap and i - Hashmap[num] <= k:
                return True
            Hashmap[num] = i
        
        return False