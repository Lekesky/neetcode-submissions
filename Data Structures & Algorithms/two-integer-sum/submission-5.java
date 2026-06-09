class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(freq.containsKey(diff) && freq.get(diff) != i){
                return new int[]{i, freq.get(diff)};
            }
        }

        return new int[2];
    }
}
