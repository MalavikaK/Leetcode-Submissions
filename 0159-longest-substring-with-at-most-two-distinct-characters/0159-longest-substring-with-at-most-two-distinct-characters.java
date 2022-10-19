class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int max_length = Integer.MIN_VALUE;
        for(int end = 0; end < s.length(); end++){
            map.put(s.charAt(end), end);
            if(map.size() >= 3){
                map.remove(s.charAt(start), start);
                    start++;
            }
             max_length = Math.max(max_length, end - start + 1);
        }
        return max_length;
    }
}