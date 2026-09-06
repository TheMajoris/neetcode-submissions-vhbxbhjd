class Solution {
    public int search(int[] nums, int target) {
        int pos = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            pos = left + (right - left) / 2;

            if(nums[pos] == target){
                return pos;
            }else if(nums[pos] < target){
                left = pos + 1;
            }else if(nums[pos] > target){
                right = pos - 1;
            }
        }
        return -1;

    }
}
