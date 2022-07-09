/*
 * @lc app=leetcode id=1695 lang=java
 *
 * [1695] Maximum Erasure Value
 */

// @lc code=start
class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> numSet = new HashSet<Integer>();
        int first = 0;
        int currSum = 0;
        int maxSum = 0;

        int i = 0;
        while (i < nums.length) {
            if (!numSet.contains(nums[i])) {
                currSum += nums[i];
                maxSum = Math.max(currSum, maxSum);
                numSet.add(nums[i]);
                i++;
            } else {
                currSum -= nums[first];
                numSet.remove(nums[first++]);
            }
        }

        return maxSum;
    }
}
// @lc code=end
