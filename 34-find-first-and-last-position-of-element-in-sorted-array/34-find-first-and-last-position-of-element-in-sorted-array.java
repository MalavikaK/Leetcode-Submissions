class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        
        return ans;
        
    }
    //function to return index value of target
    public int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else {
                ans = mid;
            if(findStartIndex){
                end = mid - 1;
            }
            else start = mid + 1;
        }
    }
      return ans;
  }
}



// return first and last occurence of target number
// search through the array to find the target through binary search
    // if found, its possible that it can occur on the left and the right
        // perform binary search again
//Two binary search will still have O(log n)