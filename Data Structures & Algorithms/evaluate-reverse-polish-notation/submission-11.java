class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int rightOp = operands.pop();
                int leftOp = operands.pop();
                operands.push(leftOp + rightOp);
            }else if(s.equals("-")){
                int rightOp = operands.pop();
                int leftOp = operands.pop();
                operands.push(leftOp - rightOp);
            }else if(s.equals("*")){
                int rightOp = operands.pop();
                int leftOp = operands.pop();
                operands.push(leftOp * rightOp);
            }else if(s.equals("/")){
                int rightOp = operands.pop();
                int leftOp = operands.pop();
                operands.push(leftOp / rightOp);
            }else{
                operands.push(Integer.parseInt(s));
            }
        }
        return operands.pop();
    }
}
