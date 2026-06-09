class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Map<Integer,Integer> freqMap = new HashMap<>();
        

        for(int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> freq = new ArrayList<>(freqMap.entrySet());
        
        freq.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = freq.get(i).getKey();
        }


        return res;
    }
}
