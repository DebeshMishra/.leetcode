/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        /*
         * Set<Integer> numSet = new HashSet<Integer>();
         * for (int num : nums) numSet.add(num);
         * 
         * int expectedNumCount = nums.length + 1;
         * for (int number = 0; number < expectedNumCount; number++) {
         * if (!numSet.contains(number)) {
         * return number;
         * }
         * }
         * return -1;
         */

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return ((nums.length * (nums.length + 1)) / 2) - sum;
    }
}
// @lc code=end
