class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            int sLength = s.length();
            sb.append(sLength);
            sb.append('#');
            sb.append(s);
        }
       return sb.toString();
    }

    public List<String> decode(String str) {
        char[] strArray = str.toCharArray();
        List<String> strs = new ArrayList<>();

        for(int i = 0; i < strArray.length; ){
            StringBuilder strLength = new StringBuilder();
            StringBuilder word = new StringBuilder();
            while(strArray[i] != '#'){
                strLength.append(strArray[i]);
                i++;
            }
            i++; //Move to starting word
            int strLengthInt = Integer.parseInt(strLength.toString());
            for(int j = 0; j < strLengthInt; j++){
                word.append(strArray[i+j]);
            }
            strs.add(word.toString());
            i = i + strLengthInt;
        }
        return strs;
    }
}
