/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {

        if (s == null || s.length() == 0)
            return null;

        List<Integer> result = new ArrayList();

        int[] endPos = new int[26];

        for (int i = 0; i < s.length(); i++) {
            endPos[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, endPos[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }
}
// @lc code=end
