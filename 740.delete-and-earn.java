/*
 * @lc app=leetcode id=740 lang=java
 *
 * [740] Delete and Earn
 */

// @lc code=start
class Solution {
    public int deleteAndEarn(int[] nums) {

        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (frequency.get(nums[i]) == null) {
                frequency.put(nums[i], nums[i]);
            } else {
                frequency.put(nums[i], frequency.get(nums[i]) + nums[i]);
            }
            max = Math.max(max, nums[i]);
        }

        int[] dp = new int[max + 1];
        dp[1] = frequency.getOrDefault(1, 0);

        for (int i = 2; i < dp.length; i++) {
            int take = frequency.getOrDefault(i, 0);
            dp[i] = Math.max(take + dp[i - 2], dp[i - 1]);
        }

        return dp[max];
    }
}
// @lc code=end
