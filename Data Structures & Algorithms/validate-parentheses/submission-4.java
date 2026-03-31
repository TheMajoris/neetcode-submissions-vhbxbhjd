class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();

        if(s.length() == 1 || s.length() == 0){
            return false;
        }
        char[] c = s.toCharArray();


        for(int i = 0; i < s.length(); i++){
            switch(c[i]) {
                case '(','{','[' -> stack.push(c[i]);
                case ')' -> {if(stack.isEmpty() || !(stack.pop().equals('('))) return false;}
                case ']' -> {if(stack.isEmpty() || !(stack.pop().equals('['))) return false;}
                case '}' -> {if(stack.isEmpty() || !(stack.pop().equals('{'))) return false;}
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
