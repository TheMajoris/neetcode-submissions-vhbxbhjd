class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        int right = left + 1;
        int count = 1;

        if(s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(left));

        while(right < s.length()){
            if(!(set.contains(s.charAt(right)))){
                set.add(s.charAt(right));
                result = Math.max(result, right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        return result;
    }
}