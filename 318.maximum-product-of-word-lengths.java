/*
 * @lc app=leetcode id=318 lang=java
 *
 * [318] Maximum Product of Word Lengths
 */

// @lc code=start
class Solution {
    public int maxProduct(String[] words) {
        List<Set<Character>> letterList = new ArrayList<>();
        int max = 0;

        for (String s : words) {
            Set<Character> letters = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                letters.add(s.charAt(i));
            }
            letterList.add(letters);
        }

        for (int i = 0; i < words.length; i++) {
            Set<Character> setI = letterList.get(i);
            for (int j = i + 1; j < words.length; j++) {
                boolean hasCommon = false;
                Set<Character> setJ = letterList.get(j);
                for (Character c : setI) {
                    if (setJ.contains(c)) {
                        hasCommon = true;
                        break;
                    }
                }

                if (!hasCommon)
                    max = Math.max(max, words[i].length() * words[j].length());
            }
        }
        return max;
    }
}
// @lc code=end
