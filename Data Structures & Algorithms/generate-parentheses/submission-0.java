/*
1. Edge cases, 1, will return (), it's always 1 to 7, 
2. I tihnk it's similar to subsets, in which I have to pick one (left or right) and then recursively call from there
    only diff is that I need to keep some sort of count of how many ")" I need.
3. Okay, so n=2 would equal ["(())", "()()"]
4. I would need to pass the count, or maybe negate one. Maybe I can also create a count, whether it is legal to put a ")". Counts of "("
5. 

*/
class Solution {
    private List<String> result;
    public void recurse(int n, int cur, String s){
        if(cur < 0){         //If right exceeds left, invalid
            return;
        }

        if(cur > 0 && s.length() == n*2){ return; }

        if(s.length() == n * 2){
            result.add(s);
            return;
        }

        //left case
        String temp = s + "(";
        recurse(n, cur+1, temp);

        //right case
        temp = s + ")";
        recurse(n, cur-1, temp);
    }

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();

        recurse(n, 0, "");

        return result;
    }
}
