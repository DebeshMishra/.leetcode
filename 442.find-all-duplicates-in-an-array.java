/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            pos = Math.abs(nums[i]);
            if (nums[pos - 1] < 0)
                res.add(pos);
            else
                nums[pos - 1] = -1 * nums[pos - 1];
        }

        return res;
    }
}
// @lc code=end
