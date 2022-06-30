class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            if(set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
}