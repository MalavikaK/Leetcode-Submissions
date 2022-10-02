class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        int max_length = 0;
        
        for(int num : nums){
            set.add(num);
        }
        
         for(int i = 0; i < nums.length; i++){
           int curr_number = nums[i];
           int curr_length = 1;
        
        if(!set.contains(curr_number-1)){
        while(set.contains(curr_number+1)){
            curr_number += 1;
            curr_length += 1;
            
            }
        }
            max_length = Math.max(curr_length, max_length);
        }
        return max_length;
    }
        
//         private boolean consecutiveCheck(int[] nums, int target){
//             for(int i = 0; i< nums.length; i++){
//             if(target == nums[i]){
//                 return true;
//             }
           
//             }
//              return false; 
//         }
       
}



//nums= {100,4,200,1,3,2}
//return max_length = {1,2,3,4}