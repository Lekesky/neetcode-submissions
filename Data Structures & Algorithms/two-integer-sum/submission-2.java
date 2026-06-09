class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int pos = map.get((target - nums[i]));
                if(pos != i){
                    int[] result = new int[2];
                    result[0] = pos;
                    result[1] = i;
                    return result;
                }
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
