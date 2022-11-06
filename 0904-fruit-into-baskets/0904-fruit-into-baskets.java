class Solution {
    public int totalFruit(int[] fruits) {
        int max_length = Integer.MIN_VALUE;
        int windowStart = 0;
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++){
            map.put(fruits[windowEnd], map.getOrDefault(fruits[windowEnd], 0) + 1);
            if(map.size() > k){
                map.put(fruits[windowStart], map.get(fruits[windowStart]) - 1);  
                if(map.get(fruits[windowStart]) == 0)
                    map.remove(fruits[windowStart]);
                windowStart ++;
            }
            max_length = Math.max(max_length, windowEnd - windowStart + 1);
        }
        return max_length;
    }
}



