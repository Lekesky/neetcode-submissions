class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0].length == 0) return false;
        int topCol = 0;
        int bottomCol = matrix.length-1;

        while(topCol <= bottomCol){
            int midCol = topCol + (bottomCol - topCol)/2; 
            if(matrix[midCol][0] == target){
                return true;
            }else if(matrix[midCol][0] < target){
                topCol = midCol + 1 ;
            }else{
                bottomCol = midCol - 1;
            }
        }

        

        if(bottomCol < 0) return false;
        int finalMidCol = bottomCol;
        
        int left = 0;
        int right = matrix[0].length-1;
        
        while(left <= right){
            int midRow = left + (right - left)/2; 
            if(matrix[finalMidCol][midRow] == target){
                return true;
            }else if(matrix[finalMidCol][midRow] < target){
                left = midRow + 1 ;
            }else{
                right = midRow - 1;
            }
        }

        return false;

    }
}
