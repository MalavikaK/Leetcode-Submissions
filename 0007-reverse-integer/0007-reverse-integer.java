class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        while(x != 0 ){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }
        else{
            return (int)rev;
        }
        
    }
}

// class Solution{
// public int reverse(int x) {
//         long res = 0;
//         while (x != 0) {
//             res = res * 10 + x % 10;
//             x = x / 10;
//         }
        
//         if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
//             return 0;
//         } else {
//             return (int)res;
//         }
//     }
// }