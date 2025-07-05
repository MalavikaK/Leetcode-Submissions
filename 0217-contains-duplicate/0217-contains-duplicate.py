
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        Hashset = set(nums)

        if(len(Hashset) != len(nums)):
            return True

        return False