class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<String, Integer> hash = new HashMap<>();
        List<Integer> arr = new ArrayList<Integer>();

        // put all this shit in the hashmap
        for(int i = 0; i < k.length - 1; i++){
            if(hash.containsKey(nums[i])){
                int temp = hash.get(nums[i]);
                temp++;
                hash.put(nums[i], temp);
            } else{
                hash.put(nums[i], 1);
            }
        }

        //get top k elements
        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (String key : map.keySet()) {
            heap.add(key);
            if(heap.size() > k) heap.poll();
        }
        
    }
}
