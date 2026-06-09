class Solution {

    List<String> res = new ArrayList<>();
    Stack<Character> sub = new Stack<>();

    public List<String> generateParenthesis(int n) {
        bt(0, 0, n);
        return res;
        


    }

    private void bt(int openN, int closeN, int n){
        
        if(openN == n && closeN == n){
            StringBuilder sb = new StringBuilder();
            for(char c : sub){
                sb.append(c);
            }
            res.add(sb.toString());
        }

        if(openN < n){
            sub.push('(');
            bt(openN + 1, closeN, n);
            sub.pop();
        }

        if(closeN < openN){
            sub.push(')');
            bt(openN, closeN + 1, n);
            sub.pop();
        }
    }
}
