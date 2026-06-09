class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anag = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sString = new String(sArray);
            anag.putIfAbsent(sString, new ArrayList<>());
            anag.get(sString).add(s);
        }

        // for(int i = 0; i < strs.length; i++){
        //     String s = strs[i];
        //     char[] sArray = s.toCharArray();
        //     Arrays.sort(sArray);
        //     String sString = new String(sArray);
            
        // }

        return new ArrayList<>(anag.values());
    }
}
