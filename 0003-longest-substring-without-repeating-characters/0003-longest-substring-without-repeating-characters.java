class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int max = 0;
        HashSet<Character>set = new HashSet<>();
        
        for(int end = 0; end < s.length(); end++){
            
            while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            }
            else{
            set.remove(s.charAt(start));
            start++;
            }
        }
    }
        return max;
    }
}

// Input: s = "pwwkew"
// Output: 3