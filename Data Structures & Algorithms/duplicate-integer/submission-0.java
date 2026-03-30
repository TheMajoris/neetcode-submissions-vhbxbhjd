class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i : nums){
            if(count.containsKey(i)){
                return true;
            }else{
                count.put(i,0);
            }
        }
        return false;
    }
}