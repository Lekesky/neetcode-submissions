class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxVal = 0;
        

        for(int i : piles){
            if(i > maxVal){
                maxVal = i;
            }
        }


        int l = 1;
        int r = maxVal;
        
        while(l < r){
            int k =  l + (r - l) / 2;
            int time = 0;
            for(int i : piles){
                time += Math.ceil((double)i / k);
            }

            if(time > h){
                l = k + 1;
            }else{
                r = k;
            }
        }
        return l;
    }
}
