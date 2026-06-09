class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 0) return true;
        s = s.toLowerCase();
        int left = 0;
        for(int right = s.length()-1; right >=0 && right >=left;){
            char cleft = s.charAt(left);
            char cright = s.charAt(right);
            if(!Character.isLetterOrDigit(cleft)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cright)){
                right--;
                continue;
            }
            if(cleft != cright) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
