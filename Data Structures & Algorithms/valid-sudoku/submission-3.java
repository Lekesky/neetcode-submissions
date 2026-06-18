class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Check rows
        for(int i = 0; i < board.length; i++){
            char[] row = board[i];
            Set<Character> validRow = new HashSet<>();
            for(int j = 0; j < row.length; j++){
                if(row[j] == '.') continue;
                boolean valid = validRow.add(row[j]);
                if(!valid) return false;
            }
        }

        //Check columns
        for(int i = 0; i < board.length; i++){
            Set<Character> validColumn = new HashSet<>();
            for(int j = 0; j < board.length; j++){
                if(board[j][i] == '.') continue;
                boolean valid = validColumn.add(board[j][i]);
                if(!valid) return false;
            }
        }

        //Check Square
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Set<Character> seen = new HashSet<>();

                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        char val = board[r][c];
                        if (val == '.') continue;

                        if (!seen.add(val)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
