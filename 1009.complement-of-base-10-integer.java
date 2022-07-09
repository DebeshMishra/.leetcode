/*
 * @lc app=leetcode id=1009 lang=java
 *
 * [1009] Complement of Base 10 Integer
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int n) {
        int power = 0;
        int ans = 0;

        if (n == 0)
            return 1;

        while (n != 0) {
            if (n % 2 == 0)
                ans += Math.pow(2, power);
            n = n >> 1;
            power++;
        }

        return ans;
    }
}
// @lc code=end
