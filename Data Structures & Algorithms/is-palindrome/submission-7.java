class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;

        if(s.length() == 1){
            return true;
        }

        if(s.length() == 0){
            return false;
        }

        while(i < j){
            char x = Character.toLowerCase(s.charAt(i));
            char y = Character.toLowerCase(s.charAt(j));

            if(!Character.isAlphabetic(x) && !Character.isDigit(x)){
                i++;
                continue;
            }

            if(!Character.isAlphabetic(y) && !Character.isDigit(y)){
                j--;
                continue;
            }
            if(x != y){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
