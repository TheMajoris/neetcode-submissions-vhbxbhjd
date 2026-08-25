class Solution {
    public int[] twoSum(int[] numbers, int target) {
        boolean found = false;
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];

        while(!found){
            int sum = numbers[i] + numbers[j];

            if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }else{
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }
        return result;
    }
}
