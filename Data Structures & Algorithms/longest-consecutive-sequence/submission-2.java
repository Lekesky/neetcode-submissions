class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSeq = 0;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        

        
        for(int num : set){
            if(!set.contains(num - 1)){
                int seq = 1;

                while(set.contains(num + seq)){
                    seq++;
                }
                if(seq > longestSeq){
                    longestSeq = seq;
                }
            }
        }
      return longestSeq;
    }
}
