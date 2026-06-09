class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(char[] row : board){
            Map<Character, Integer> hdup = new HashMap<>();
            for(char c : row){
                if(hdup.containsKey(c) && c != '.') return false;
                hdup.put(c , hdup.getOrDefault(c, 0) + 1);
            }
        }

        for(int i = 0; i < board.length; i++){
            Map<Character, Integer> vdup = new HashMap<>();
            for(int j = 0; j < board.length; j++){
                char c = board[j][i];
                if(vdup.containsKey(c) && c != '.') return false;
                vdup.put(c , vdup.getOrDefault(c, 0) + 1);
            }
        }

        int hbox = 0;
        int vbox = 0;
        while(vbox < board.length){
            Map<Character, Integer> bdup = new HashMap<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    char c = board[vbox+i][hbox+j];
                    if(bdup.containsKey(c) && c != '.') return false;
                    bdup.put(c , bdup.getOrDefault(c, 0) + 1);
                }
            }

            hbox += 3;
            if(hbox >= board.length){
                hbox = 0;
                vbox += 3;
            }
            
        }

        return true;
    }
}
