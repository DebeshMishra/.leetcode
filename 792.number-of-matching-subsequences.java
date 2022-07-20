/*
 * @lc app=leetcode id=792 lang=java
 *
 * [792] Number of Matching Subsequences
 */

// @lc code=start
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        char[] charArr = s.toCharArray();
        int result = 0;

        for (String str : map.keySet()) {
            char[] temp = str.toCharArray();
            int i = 0, j = 0;

            while (i < str.length() && j < s.length()) {
                if (temp[i] == charArr[j]) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }

            if (i == str.length()) {
                result += map.get(str);
            }
        }

        return result;
    }
}
// @lc code=end
