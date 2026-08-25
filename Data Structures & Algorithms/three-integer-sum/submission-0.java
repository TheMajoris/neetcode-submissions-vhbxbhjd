class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;

            int find = nums[i];

            while(left < right){
                if((nums[left] + nums[right] + find == 0)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[i]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                }else if(nums[left] + nums[right] + find > 0){
                    right--;
                }else if(nums[left] + nums[right] + find < 0){
                    left++;
                }
            }
        }
        return result;
    }
}
