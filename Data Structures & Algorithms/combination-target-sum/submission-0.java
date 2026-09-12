/*
1.

*/
class Solution {
    private List<List<Integer>> result;
    private int[] nums;


    public void recurse(int i, int remaining, List<Integer> set){
        if(remaining == 0){         //If it's equal, add the set and return (end the recursive cycle)
            result.add(new ArrayList<>(set));
            return;
        }

        if(remaining < 0 || i == nums.length){          //If it's over, just return (end the recrusive cycle)
            return;
        }

        recurse(i+1, remaining, set);           //Skip the current element
        set.add(nums[i]);                       //Add the current element and recurse again
        recurse(i, remaining - nums[i], set);
        set.remove(set.size() - 1);

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        this.nums = nums;

        recurse(0, target, new ArrayList<>());

        return result;
    }
}
