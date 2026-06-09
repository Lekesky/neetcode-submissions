class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> freq = new HashMap<>();
        PriorityQueue<Integer> topK = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for(int key : freq.keySet()){
            topK.add(key);
            if (topK.size() > k) {
                topK.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = topK.poll();
            
        }
        
        return res;
    }
}
