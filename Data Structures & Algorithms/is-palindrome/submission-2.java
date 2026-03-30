class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;

        String lowercase = s.toLowerCase();

        for(int i = 0; i < j; i++){
            while(i < j && !Character.isLetterOrDigit(lowercase.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(lowercase.charAt(j))) j--;
            if(lowercase.charAt(i) != lowercase.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
