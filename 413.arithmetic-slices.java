/*
 * @lc app=leetcode id=413 lang=java
 *
 * [413] Arithmetic Slices
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        int dp[] = new int[nums.length];

        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                result += dp[i];
            }
        }

        return result;
    }
}
// @lc code=end
