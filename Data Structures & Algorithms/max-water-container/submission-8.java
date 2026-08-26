class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max_area = (right - left) * Math.min(heights[left], heights[right]);

        while(left < right){
            if(heights[left] < heights[right]){
                left++;
                max_area = Math.max(max_area, (right - left) * Math.min(heights[left], heights[right]));
            }else if (heights[left] >= heights[right]){
                right--;
                max_area = Math.max(max_area, (right - left) * Math.min(heights[left], heights[right]));
            }
        }

        return max_area;
    }
}
