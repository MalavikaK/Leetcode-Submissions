class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n       #we define an array wil all elements as 1

        left = 1

        for i in range(n):
            res[i] = left
            left = left * nums[i]
            
        right = 1 
        for i in range(n-1,-1,-1):
            res[i] = res[i] * right
            right = right * nums[i]
    
        return res