class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)){
                list.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}