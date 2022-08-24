/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
// @lc code=end
