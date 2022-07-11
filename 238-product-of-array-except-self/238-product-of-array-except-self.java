class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;            //array of numbers
        
        int[] left_prod = new int[N];   //products of numbers from left to current element
        int[] right_prod = new int[N];  //product of numbers from right to current element
        int[] output = new int[N];      //stores left_prod * right_prod
        
        left_prod[0] = 1;
        right_prod[N-1] = 1;
        
        for (int i=1; i<N; i++){
            left_prod[i] = nums[i-1] * left_prod[i-1];
        }
        
        for(int i=N-2; i>=0; i--){
            right_prod[i] = nums[i+1] * right_prod[i+1];
        }
        
        for(int i=0; i<N; i++){
            output[i] = left_prod[i] * right_prod[i];
        }
        
        return output;
    }       
}