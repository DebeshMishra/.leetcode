/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        answer[0] = 1;

        // prefix multiplication
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // postfix multiplication
        int last = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= last;
            last *= nums[i];
        }

        return answer;
    }
}
// @lc code=end
