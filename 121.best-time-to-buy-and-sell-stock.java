/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        int max = 0, present = 0, future = 1;
        int curr = 0;

        while (present < future) {
            if (future < prices.length && prices[present] < prices[future]) {
                curr = prices[future] - prices[present];
                max = Math.max(max, curr);
                future++;
            } else {
                if (future == prices.length)
                    break;
                present = future;
                future++;
            }
        }

        return (max <= 0 ? 0 : max);
    }
}
// @lc code=end
