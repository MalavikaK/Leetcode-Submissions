class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        //read word1
        //output first letter of word 1
        //read word 2
        ///append first letter of word 2 to first letter of word1
        //read word 1 again
        //append 2nd letter of word1 to first letter of word2
        //and so on....
        
        StringBuilder result = new StringBuilder();
        
        int m = word1.length();
        int n = word2.length();
        int i=0, j=0;
        
       while(i<m || j<n){
       // for(i = 0; i < Math.max(m,n); i++){
            if(i<m){
                result.append(word1.charAt(i++));
            }
            if(j<n){
                result.append(word2.charAt(j++));
            }
        }
        
        return result.toString();
        
    }
}