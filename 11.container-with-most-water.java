/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int length = 0, breadth = 0, area = 0;
        int start = 0, finish = height.length - 1;

        while (start < finish) {
            length = finish - start;
            breadth = Math.min(height[start], height[finish]);
            area = Math.max(length * breadth, area);
            if (height[finish] < height[start])
                finish--;
            else
                start++;
        }

        return area;
    }
}
// @lc code=end
