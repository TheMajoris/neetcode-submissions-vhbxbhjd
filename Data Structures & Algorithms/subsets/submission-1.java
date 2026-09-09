class Solution {
    private int[] nums;
    private List<List<Integer>> result;

    public void recurse(int i, List<Integer> set){
        if (i == nums.length) {              // base case — the ONLY if
            result.add(new ArrayList<>(set));
            return;
        }

        //Leave nums[i]
        recurse(i+1, set);

        //Take nums[i]
        set.add(nums[i]);            //Add nums[i]
        recurse(i+1, set);           //Recurse it
        set.remove(set.size() - 1);    //Remove nums[i] from the set

    }

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        this.result = new ArrayList<>();

        recurse(0, new ArrayList<>());

        return result;
    }
}
