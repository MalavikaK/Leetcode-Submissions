class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n  # [1,1,1,1]

        left = 1
        for i in range(n):  # nums = [1,2,3,4]
            res[i] = res[i] * left  # [1,1,2,6]
            left = left * nums[i]

        right = 1
        for i in range(n - 1, -1, -1):  # res = [1,1,2,6]
            res[i] = res[i] * right
            right = right * nums[i]

        return res

