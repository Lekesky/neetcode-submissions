class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> pol = new Stack<>();
        pol.push(0);
        for(String c : tokens){
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                pol.push(Integer.parseInt(c));
            }else{
                int total = 0;
                int n1 = pol.pop();
                int n2 = pol.pop();
                if(c.equals("+")){
                    total += n2 + n1;
                }else if(c.equals("-")){
                    total += n2 - n1;
                }else if(c.equals("*")){
                    total += n2 * n1;
                }else if(c.equals("/")){
                    total += (n2 / n1);
                }
                pol.push(total);  
            }
        }
        return pol.pop();
    }
}
