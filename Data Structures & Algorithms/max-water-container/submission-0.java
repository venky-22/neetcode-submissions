class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<right){
            int width = right - left;

            int height = Math.min(heights[right], heights[left]);

            int currentArea = width*height;

            area = Math.max(area, currentArea);

            if(heights[left]< heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return area;
    }

}
