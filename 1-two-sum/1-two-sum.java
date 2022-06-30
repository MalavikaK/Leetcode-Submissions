class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap <>();
        for (int i=0; i<nums.length; i++){
            Integer reqNum = (Integer) (target-nums[i]);
            if(map.containsKey(reqNum)){
                int toReturn[] = {map.get(reqNum),i};
                return toReturn;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}