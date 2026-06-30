class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] posSpeed = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            posSpeed[i][0] = position[i];
            posSpeed[i][1] = speed[i];
        }

        Arrays.sort(posSpeed, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> s = new Stack<>();
        for(int[] pair : posSpeed){
            s.push((double) (target - pair[0])/pair[1]);

            if(s.size() >= 2 && s.peek() <= s.get(s.size() - 2)){
                s.pop();
            }
        }

        return s.size();
    }
}
