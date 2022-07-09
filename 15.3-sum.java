/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                if (sum > 0)
                    k--;
                if (sum < 0)
                    j++;
            }
        }

        return new ArrayList<>(result);
    }
}
// @lc code=end
