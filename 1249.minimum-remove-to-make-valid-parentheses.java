/*
 * @lc app=leetcode id=1249 lang=java
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder temp = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0)
                    continue;
                open--;
            }

            temp.append(c);
        }

        StringBuilder result = new StringBuilder();

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == '(' && open-- > 0)
                continue;
            result.append(temp.charAt(i));
        }

        return result.reverse().toString();
    }
}
// @lc code=end
