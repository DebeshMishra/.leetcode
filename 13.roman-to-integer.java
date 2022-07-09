/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    num = (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) ? num - 1
                            : num + 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num = (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ? num - 10
                            : num + 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num = (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ? num - 100
                            : num + 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
                    num += 1;
                    break;
            }
        }

        return num;
    }
}
// @lc code=end
