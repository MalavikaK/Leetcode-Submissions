class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); //to store the elements that occured once
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            if(set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
}
//logic
//Use a HashSet to store the elements in the array that occured only once. If the same number is encountered again, return true. Else return false. Time complexity is O(n) and space complexity is O(1).