class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<int[]> temps = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while(!temps.isEmpty() && temps.peek()[0] < temp){
                int[] pair = temps.pop();
                res[pair[1]] = i - pair[1];
            }
            temps.push(new int[] {temp, i});
        }
        return res;
    }
}
