class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        
        
        int start = 0;
        
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            
            while (sum >= target){
                min_length = Math.min(min_length, end - start + 1);
                sum -= nums[start];
                start++;
                
            }
            
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}

// public int minSubArrayLen(int s, int[] a) {
//   if (a == null || a.length == 0)
//     return 0;
  
//   int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
//   while (j < a.length) {
//     sum += a[j++];
    
//     while (sum >= s) {
//       min = Math.min(min, j - i);
//       sum -= a[i++];
//     }
//   }
  
//   return min == Integer.MAX_VALUE ? 0 : min;
// }


// sliding window problem
// start = end = 0
// iterate through an array from end to arr.length
// end ++
// if (sum > = 7 )
// sum = sum - arr[start]
// return min (sum, end - start)
    