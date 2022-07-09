/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start
import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {

        Sort2DArrayBasedOnColumnNumber(points, 2);
        int arrows = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }

    public static void Sort2DArrayBasedOnColumnNumber(int[][] array, final int columnNumber) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                if (first[columnNumber - 1] > second[columnNumber - 1])
                    return 1;
                else
                    return -1;
            }
        });
    }
}
// @lc code=end
