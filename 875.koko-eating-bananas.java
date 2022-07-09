/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
import java.lang.Math;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int workableSpd = 0;
        int right = piles[0];
        int left = 1;
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        while (left < right) {
            int time = 0;
            workableSpd = (right + left) / 2;
            for (int pile : piles) {
                time += Math.ceil((double) pile / workableSpd);
            }
            if (time <= h) {
                right = workableSpd;
            } else {
                left = workableSpd + 1;
            }
        }

        return right;
    }
}
// @lc code=end
