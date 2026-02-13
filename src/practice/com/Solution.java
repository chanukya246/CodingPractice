package practice.com;

import java.util.HashSet;

class Solution {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solution = new Solution();
        System.out.println("Is valid Sudoku? " + solution.isValidSudoku(board));
    }

        public boolean isValidSudoku(char[][] board) {
            // 9 sets for rows, columns, and boxes
            HashSet<Character>[] rows = new HashSet[9];
            HashSet<Character>[] cols = new HashSet[9];
            HashSet<Character>[] boxes = new HashSet[9];

            // initialize all sets
            for (int i = 0; i < 9; i++) {
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            // iterate over all cells
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    char val = board[r][c];

                    if (val == '.') continue;

                    // check row
                    if (rows[r].contains(val)) return false;
                    rows[r].add(val);

                    // check column
                    if (cols[c].contains(val)) return false;
                    cols[c].add(val);

                    // check 3x3 box
                    int boxIndex = (r / 3) * 3 + (c / 3);
                    if (boxes[boxIndex].contains(val)) return false;
                    boxes[boxIndex].add(val);
                }
            }

            return true;
        }

}