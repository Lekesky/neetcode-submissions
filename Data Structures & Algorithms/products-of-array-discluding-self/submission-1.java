class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCount = 0;
        for(int n : nums){
            if(n == 0) zeroCount++; 
            else total *= n;
        }

        if(zeroCount > 1){
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 0){
                res[i] = (nums[i] == 0) ? total : 0;
            }else{
                res[i] = total / nums[i];
            }
        }

        return res;
    }
}  
