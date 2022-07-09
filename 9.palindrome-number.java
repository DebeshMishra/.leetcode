/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int length = String.valueOf(x).length();
        String reverse = "";
        int temp = x;

        for (int i = 0; i < length; i++) {
            reverse = reverse + String.valueOf(temp % 10);
            temp /= 10;
        }

        if (Double.valueOf(reverse) == x)
            return true;
        else
            return false;
    }
}
// @lc code=end
