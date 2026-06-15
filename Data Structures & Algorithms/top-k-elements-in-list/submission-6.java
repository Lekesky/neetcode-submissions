class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Map<Integer, Integer>> priorQueue = new PriorityQueue<>(
           (o1, o2) -> (
            o2.entrySet().iterator().next().getValue() 
            -
            o1.entrySet().iterator().next().getValue()
            )
        );

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            Map<Integer, Integer> temp = new HashMap<>();
            temp.put(entry.getKey(), entry.getValue());
            priorQueue.add(temp);
        }

        for(int i = 0; i < k; i++){
            res[i] = priorQueue.poll().entrySet().iterator().next().getKey();
        }
        return res;
    }
}
