/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        int indx1 = 0;
        String subStr = new String();
        String temp = new String();

        for (int i = 0; i < charArr.length;) {
            if (!subStr.contains(String.valueOf(charArr[i]))) {
                subStr += charArr[i];
                i++;
            } else {
                if (temp.length() <= subStr.length())
                    temp = subStr;
                subStr = new String();
                indx1++;
                i = indx1;
            }
        }

        return Math.max(subStr.length(), temp.length());
    }
}
// @lc code=end
