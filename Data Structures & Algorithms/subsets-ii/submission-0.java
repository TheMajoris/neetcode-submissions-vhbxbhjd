class Solution {
    private List<List<Integer>> result;
    private int[] nums;

    public void recurse(int i, List<Integer> set){
        if(i == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }
        //take case
        set.add(nums[i]);
        recurse(i+1, set);
        set.remove(set.size() - 1);

        //leave case
        while(i < nums.length - 1 && nums[i] == nums[i+1]){
            i++;
        }
        recurse(i+1, set);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();

        Arrays.sort(nums);
        this.nums = nums;

        recurse(0, new ArrayList<>());

        return result;
    }
}
