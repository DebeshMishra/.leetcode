/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int power = 0;
        int ans = 0;

        if (num == 0)
            return 1;

        while (num != 0) {
            if (num % 2 == 0)
                ans += Math.pow(2, power);
            num = num >> 1;
            power++;
        }

        return ans;
    }
}
// @lc code=end
