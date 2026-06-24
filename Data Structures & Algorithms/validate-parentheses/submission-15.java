class Solution {
    public boolean isValid(String s) {
        Stack<Character> openParen = new Stack<>();
        if(s.length() == 0) return true;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                openParen.push(c);
            }else if(openParen.size() != 0){
                if(openParen.peek() == '(' && c == ')'){
                    openParen.pop();
                }else if(openParen.peek() == '{' && c == '}'){
                    openParen.pop();
                }else if(openParen.peek() == '[' && c == ']'){
                    openParen.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return openParen.isEmpty();
    }
}
