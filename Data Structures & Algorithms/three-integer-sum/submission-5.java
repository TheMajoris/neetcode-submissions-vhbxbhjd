class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int j,k = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            j = i+1;
            k = nums.length - 1;
            
            while(j < k){
                if(nums[j] + nums[k] + nums[i] > 0){
                    k--;
                }else if(nums[j] + nums[k] + nums[i] < 0){
                    j++;
                }else{
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;    
                }
            }
        }

        return result;
    }
}
