class Solution {
    public int maxArea(int[] heights) {
        int area = 0;

        int left = 0;
        int right = heights.length -1;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            int width = right - left;

            area = Math.max(area, (minHeight * width));

            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }

        return area;
    }
}
