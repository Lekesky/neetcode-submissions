class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        String sLower = s.toLowerCase();
        char[] sArray = sLower.toCharArray();

        while(l < r){
            while(!Character.isLetterOrDigit(sArray[l]) && l < r){
                l++;
            }
            while(!Character.isLetterOrDigit(sArray[r]) && l < r){
                r--;
            }
            if(sArray[l] != sArray[r]) return false;

            l++;
            r--;
        }

        return true;
    }
}
