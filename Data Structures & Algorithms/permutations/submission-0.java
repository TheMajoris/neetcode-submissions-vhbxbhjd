class Solution {
    private List<List<Integer>> recurse(List<Integer> numsList) {
        // Base case: one element has exactly one permutation — itself (copied!)
        if (numsList.size() == 1) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>(numsList));   // copy, never the live list
            return base;
        }

        List<List<Integer>> result = new ArrayList<>();   // LOCAL, returned upward

        for (int i = 0; i < numsList.size(); i++) {
            int n = numsList.remove(0);        // pop FIRST element, capture it
            List<List<Integer>> perms = recurse(numsList);   // perms of the rest

            for (List<Integer> perm : perms) {
                perm.add(n);                   // n goes last in each smaller perm
            }
            result.addAll(perms);

            numsList.add(n);                   // restore — the undo
        }

        return result;
    }

    public List<List<Integer>> permute(int[] nums) {
        // Box int[] into List<Integer> — Arrays.asList doesn't work on int[]
        List<Integer> numsList = new ArrayList<>();
        for (int x : nums) {
            numsList.add(x);
        }
        return recurse(numsList);
    }
}