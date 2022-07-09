/*
 * @lc app=leetcode id=1510 lang=java
 *
 * [1510] Stone Game IV
 */

// @lc code=start
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] allOutcomes = new boolean[n + 1];
        allOutcomes[1] = true;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (!allOutcomes[i - (j * j)]) {
                    allOutcomes[i] = true;
                    break;
                }
            }
        }

        return allOutcomes[n];
    }
}
// @lc code=end
