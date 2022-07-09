/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        int count = backtrack(n, board, 0);

        return count;
    }

    private int backtrack(int n, char[][] board, int row) {
        if (row == n)
            return 1;

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (canPlaceQ(board, row, col)) {
                board[row][col] = 'Q';
                count += backtrack(n, board, row + 1);
                board[row][col] = '.';
            }
        }

        return count;
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
