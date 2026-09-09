/*
1. Simplest Input: 0, which would be [[], [0]] = 2
2. Examples
[0,1] = [], [0], [1], [0,1] = 4
[0,1,2] = [], [0], [1], [0,1], [2], [0,2], [1,2], [0,1,2] = 8
[0,1,2,3] = [], [0], [1], [0,1], [2], [0,2], [1,2], [0,1,2], [3], [0,3], [1,3], [2,3], [0,1,2,3] = 13
3. All of the cases have a relation with the previous case. You add all of the previous cases and add the next case to get what you need
4. 
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        result.add(List.of()); // Guaranteed to have a single blank subset

        for(int i = 0; i < nums.length; i++){
            List<List<Integer>> snapshot = new ArrayList<>(result);
            for(List<Integer> temp : snapshot){
                List<Integer> copy = new ArrayList<>();
                copy.addAll(temp);
                copy.add(nums[i]);
                result.add(copy);
            }
        }

        return result;
        
    }
}