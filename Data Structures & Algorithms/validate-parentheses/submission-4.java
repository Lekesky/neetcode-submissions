class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length() == 1) return false;
        Stack<Character> paren = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                paren.push(c);
            }else{
                if(!paren.isEmpty()) {
                    char letter = paren.pop();
                    if((letter == '[' && c != ']') || (letter == '{' && c != '}') || (letter == '(' && c != ')')){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return paren.size() == 0;
    }
}
