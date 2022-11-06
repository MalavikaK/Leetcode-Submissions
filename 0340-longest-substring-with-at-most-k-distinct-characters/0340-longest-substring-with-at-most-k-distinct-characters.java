class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int start = 0;
        int max_length = Integer.MIN_VALUE;    
        HashMap<Character,Integer> map = new HashMap<>();        
        for(int end = 0; end < s.length(); end++){
                 map.put(s.charAt(end), end);
            if(map.size() > k){
                map.remove(s.charAt(start), start);
                start++;
            }
           max_length = Math.max(max_length, end - start + 1);
        }
            return max_length;
    }
 }
