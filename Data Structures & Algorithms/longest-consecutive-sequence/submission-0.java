/**
1. Put all the elements into a hashset
2. Iterate over it to see if there is a sequence
    - For every number, is there a number before it? 
        - NO: count = 1, is there number + 1?, continue iterating until no, then save the count
        - YES: skip, not the beginning of the sequence
**/



class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> numSet = new HashSet<Integer>();

        //Populate the hashset 
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }

        //Check if there is a sequence
        for(int num : numSet){
            if(numSet.contains(num - 1)){
                continue;
            }else{
                int count = 1;
                while(numSet.contains(num + 1)){
                    count++;
                    num++;
                }

                if(count > result){
                    result = count;
                }
            }
        }
        return result;
    }
}
