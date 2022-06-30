class Solution {
    public boolean isPalindrome(int x) {
       
        if(x == 0)
            return true;
        
        if (x < 0 || (x % 10 ==0 && x != 0)){
            return false;
        }
        
        int reversed_x = 0;
        
       while (x > reversed_x ){
        int pop = x % 10;
        reversed_x = (reversed_x * 10) + pop;
        x /= 10;
       }
        
        if (x == reversed_x || x == reversed_x/10)
            return true;
        else return false;
        
    
    }
}
 
