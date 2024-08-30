class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new Set[9];
        Set<Character>[] col = new Set[9];
        Set<Character>[] subBox = new Set[9];
        for(int i=0;i<board.length;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            subBox[i] = new HashSet<>();
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                
                if(num == '.'){
                    continue;
                }
                int boxIndex = (i/3)*3+j/3;
                if(row[i].contains(num) || col[j].contains(num) ||subBox[boxIndex].contains(num)){
                    return false;
                }
                row[i].add(num);
                col[j].add(num);
                subBox[boxIndex].add(num);
            }
        }
        return true;
    }
}