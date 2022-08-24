/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
public class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
// @lc code=end
