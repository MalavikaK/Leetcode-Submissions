class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] char_count = new int[26];
        for(int i = 0; i <s.length(); i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }            
        for(int count : char_count){
            if(count != 0)
                return false;
        }   
        return true;
    }
}

/* create an array for 26 alphabetical characters. For
    For string 1, calculate the charAt(i)-'a' to get the index and increment the occurence     in the array
    For array 2, calculate the charAt(i)-'a' to get the index and decrement the occurence     in the array
    Once the count in the array is equated to 0 for all occured characters, return true.       Else return false.
*/




