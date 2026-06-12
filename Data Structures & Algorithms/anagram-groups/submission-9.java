class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anag = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] sArray = strs[i].toCharArray();
            Arrays.sort(sArray);
            String sString = new String(sArray);
            if(!anag.containsKey(sString)){
                anag.put(sString, new ArrayList<>());
            }
            anag.get(sString).add(strs[i]);
        }
        return new ArrayList<>(anag.values()); 
    }
}
