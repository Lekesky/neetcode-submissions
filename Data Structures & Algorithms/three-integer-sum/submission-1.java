class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    if(!res.contains(Arrays.asList(nums[i], nums[left], nums[right]))){
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    }
                    left++;
                }else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return res;
    }
}
