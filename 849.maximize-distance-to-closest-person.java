/*
 * @lc app=leetcode id=849 lang=java
 *
 * [849] Maximize Distance to Closest Person
 */

// @lc code=start
class Solution {
    public int maxDistToClosest(int[] seats) {
        int left = -1;
        int right = -1;
        int empty = 0;
        int temp = 0;
        int case2 = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                right = i;
                temp = (int) (Math.floor((empty + 1) / 2));
                if (temp > case2)
                    case2 = temp;
                empty = 0;
                if (left == -1) {
                    left = i;
                }
            } else {
                empty++;
            }
        }

        int case3 = seats.length - 1 - right;

        if (left >= case2 && left >= case3)
            return left;

        else if (case2 > left && case2 >= case3)
            return case2;

        else
            return case3;
    }
}
// @lc code=end
