class Solution {
    private List<List<Integer>> result;
    private int[] nums;

    public void recurse(int i, int remaining, List<Integer> set){
        if(remaining == 0){
            result.add(new ArrayList<>(set));
            return;
        }

        if(remaining < 0 || i == nums.length){
            return;
        }
        //last one
        if(i == nums.length - 1){

        }

        //take case
        set.add(nums[i]);
        recurse(i+1, remaining - nums[i], set);
        set.remove(set.size() - 1);

        //leave case
        while(i < nums.length - 1 && nums[i] == nums[i+1]){
            i++;
        }
        recurse(i+1, remaining, set);
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        this.nums = nums;

        recurse(0, target, new ArrayList<>());

        return result;
    }
}
