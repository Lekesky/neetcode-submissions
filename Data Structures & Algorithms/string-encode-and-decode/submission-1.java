class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for(String s : strs){
            int sSize = s.length();
            string.append(sSize);
            string.append('#');
            string.append(s);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int ptr = 0;
        while(ptr < str.length()){
            int j = ptr;
            StringBuilder string = new StringBuilder();
            StringBuilder size = new StringBuilder();
            while(str.charAt(j) != '#'){
                size.append(str.charAt(j));
                j++;
            }

            ptr = j + 1;

            int strSize = Integer.parseInt(size.toString());

            String word = str.substring(ptr, ptr + strSize);
            
            list.add(word);
            ptr += strSize;
        }
        return list;
    }
}
