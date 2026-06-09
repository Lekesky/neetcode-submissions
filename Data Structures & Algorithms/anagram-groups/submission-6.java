class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String strArr = String.valueOf(arr);
            if(!group.containsKey(strArr)){
                group.put(strArr, new ArrayList<>());
            }
            group.get(strArr).add(s);
        }

        return new ArrayList<>(group.values());
    }
}
