class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // map.get(complement) returns the position of the complement
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return new int[0];
    }
}