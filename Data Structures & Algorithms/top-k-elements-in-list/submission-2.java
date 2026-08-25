class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1 && k == 1){
            return nums;
        }

        Map<Integer, Integer> hash = new HashMap<>();

        // put all this shit in the hashmap
        for(int i = 0; i < nums.length - 1; i++){
            if(hash.containsKey(nums[i])){
                int temp = hash.get(nums[i]);
                temp++;
                hash.put(nums[i], temp);
            } else{
                hash.put(nums[i], 1);
            }
        }

        //get top k elements
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> hash.get(a) - hash.get(b));

        for (Integer key : hash.keySet()) {
            heap.add(key);
            if(heap.size() > k) heap.poll();
        }
        List<Integer> result = new ArrayList<Integer>(heap);
        int[] arrResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(i);
        }
        return arrResult;
    }
}
