class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map = new HashMap<>();

        //rows
        for(int j = 0; j < 9; j++){
            map.clear();
            for(int i = 0; i < 9; i++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(!map.containsKey(board[j][i])){
                    map.put(board[j][i], 1);
                }else{
                    return false;
                }
            }
        }   
        //columns
        for(int j = 0; j < 9; j++){
            map.clear();
            for(int i = 0; i < 9; i++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j], 1);
                }else{
                    return false;
                }
            }
        }

        // 3x3 boxes
        for (int box = 0; box < 9; box++) {
            map.clear();
            for (int k = 0; k < 9; k++) {
                int row = (box / 3) * 3 + k / 3;
                int col = (box % 3) * 3 + k % 3;
                char c = board[row][col];
                if (c == '.') {
                    continue;
                }
                if (map.containsKey(c)){
                    return false;
                }
                map.put(c, 1);
            }
        }

        return true;
    }
}
