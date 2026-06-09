class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : freqMap.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }
        

        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length-1; i > 0; i--){
            for(int j : freq[i]){
                res[index++] = j;
                if(index == k){
                    return res;
                }
            }
            
        }
        return res;
    }
}
