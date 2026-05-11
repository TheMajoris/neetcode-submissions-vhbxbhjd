class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                map.replace(s.charAt(i), ++value);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(t.charAt(i)) && (map.get(t.charAt(i)) > 0)){
                int value = map.get(t.charAt(i)) - 1;
                map.replace(t.charAt(i), value);
            }else{
                return false;
            }
        }
        return true;
    }
}
