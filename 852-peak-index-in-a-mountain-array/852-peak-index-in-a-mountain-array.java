class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length-1;
        
        while(start != end){
            
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
           if(start == end){
               return start;
           } 
        }
       return -1; 
    }
    
  
}

// {1,2,3,5,6,4,3,2}
//a[mid] = 5