/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        List<List<String>> result = new ArrayList();
        backtrack(n, board, 0, result);

        return result;
    }

    private void backtrack(int n, char[][] board, int row, List<List<String>> result) {
        if (row == n) {
            List<String> temp = new ArrayList();
            for (int i = 0; i < n; i++)
                temp.add(new String(board[i]));

            result.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (canPlaceQ(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(n, board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    private boolean canPlaceQ(char[][] board, int row, int col) {
        // vertical check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // anti-diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
// @lc code=end
