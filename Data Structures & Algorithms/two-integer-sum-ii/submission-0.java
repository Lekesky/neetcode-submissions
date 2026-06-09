class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        if(size == 0) return new int[2];

        int left = 0;
        int right = size-1;

        while(right >= left){
            if(numbers[left] + numbers[right] < target){
                left++;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                int[] res = new int[2];
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
        }
        return new int[2];
    }
}