class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sFreq = new HashMap<>();
        Map<Character, Integer> tFreq = new HashMap<>();

        for(char c : s.toCharArray()){
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        return sFreq.equals(tFreq);
    }
}