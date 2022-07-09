/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumOfGas = IntStream.of(gas).sum();
        int sumOfCost = IntStream.of(cost).sum();
        int start = 0;
        int diff = 0;

        if (sumOfCost > sumOfGas)
            return -1;

        for (int i = 0; i < gas.length; i++) {
            diff += gas[i] - cost[i];
            if (diff < 0) {
                diff = 0;
                start = i + 1;
            }
        }

        return start;
    }
}
// @lc code=end
