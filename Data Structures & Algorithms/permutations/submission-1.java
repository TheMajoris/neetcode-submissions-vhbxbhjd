class Solution {
    private List<List<Integer>> recurse(List<Integer> nums){
        List<List<Integer>> result = new ArrayList<>();
        //Base case, where the permutation is just length 1
        if(nums.size() == 1){
            List<List<Integer>> base = new ArrayList<>();   //Create the base in which the permutations can get created
            base.add(new ArrayList<>(nums));
            return base;
        }

        for(int i = 0; i < nums.size(); i++){
            int n = nums.remove(0);
            List<List<Integer>> perms = recurse(nums);
            for(List<Integer> perm : perms){
                perm.add(n);                    //Concat n
            }
            result.addAll(perms);               // Add all the new ones to result
            nums.add(n);
        }

        return result;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<Integer>();
        for(int x : nums){
            numsList.add(x);
        }

        return recurse(numsList);
    }
}
