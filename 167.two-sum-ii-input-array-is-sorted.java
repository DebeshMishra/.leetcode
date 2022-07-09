/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int idx1 = 0, idx2 = numbers.length - 1;

        while (idx1 < idx2) {
            if (numbers[idx1] + numbers[idx2] > target) {
                idx2--;
            } else if (numbers[idx1] + numbers[idx2] < target) {
                idx1++;
            } else {
                break;
            }
        }

        return new int[] { idx1 + 1, idx2 + 1 };
    }
}
// @lc code=end
