class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();  // use StringBuilder in loops
        for (String s : strs) {
            result.append(s.length());
            result.append("#");
            result.append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') j++;
            String length = str.substring(i, j);
            int intLength = Integer.parseInt(length);

            String sub = str.substring(j+1, j+1+intLength);
            result.add(sub);

            i = j + 1 + intLength;
        }

        return result;
    }
}
