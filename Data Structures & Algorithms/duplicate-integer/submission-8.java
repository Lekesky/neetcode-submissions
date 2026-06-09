class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set numList = new HashSet();
        for(int i = 0; i < nums.length; i++){
            boolean dup = numList.add(nums[i]);
            if(!dup) return true;
        }
        return false;
    }
}