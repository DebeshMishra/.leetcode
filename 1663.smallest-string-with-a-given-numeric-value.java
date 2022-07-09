/*
 * @lc app=leetcode id=1663 lang=java
 *
 * [1663] Smallest String With A Given Numeric Value
 */

// @lc code=start
class Solution {
    public String getSmallestString(int n, int k) {
        HashMap<Integer, Character> abcd = new HashMap<Integer, Character>();
        char alpha = 'a';
        for (int i = 1; i <= 26; i++) {
            abcd.put(i, alpha);
            alpha++;
        }

        int[] intString = new int[n];
        // Arrays.fill(intString, 1);
        int temp = k - n;
        for (int i = n - 1; i >= 0; i--) {
            if (temp == 0)
                break;
            intString[i] = Math.min(25, temp);
            temp -= intString[i];
        }

        char[] charString = new char[n];
        for (int i = 0; i < n; i++) {
            charString[i] = abcd.get(intString[i] + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char c : charString) {
            result.append(c);
        }

        return result.toString();
    }
}
// @lc code=end
