class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        
        
        for(int i = 0; i < temperatures.length; i++){
            Stack<Integer> daily = new Stack<>();
            int currTemp = temperatures[i];
            for(int j = i; j < temperatures.length; j++){
                int futureTemp = temperatures[j];
                if(futureTemp > currTemp){
                    days[i] = daily.size();
                    break;
                }else{
                    daily.push(futureTemp);
                }
            }
        }

        return days;
    }
}
