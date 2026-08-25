/*
1. Firstly, Get an integer i, and for each of them, run a loop through the list (skipping the index i) and get the result, put it in the result

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }

                product *= nums[j];
            }
            result[i] = product;
        }

        return result;
    }
}  
