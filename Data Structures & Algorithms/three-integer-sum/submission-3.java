class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i+1; j < nums.length; j++){
                int comp = nums[i] + nums[j];
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                for(int k = j+1; k < nums.length; k++){
                    if(k > j + 1 && nums[k] == nums[k - 1]) continue;
                    if(nums[k] + comp == 0){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                }
            }
        }

        return result;
    }
}
