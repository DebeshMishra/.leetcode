import java.util.Map;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freqMap = new HashMap();
        int minIndex = Integer.MAX_VALUE;

        for (Character c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Character c : freqMap.keySet()) {
            if (freqMap.get(c) == 1) {
                minIndex = Math.min(minIndex, s.indexOf(c));
            }
        }

        if (minIndex == Integer.MAX_VALUE)
            minIndex = -1;

        return minIndex;
    }
}
// @lc code=end
