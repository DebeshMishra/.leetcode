import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=890 lang=java
 *
 * [890] Find and Replace Pattern
 */

// @lc code=start
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String s : words) {
            if (patternCheck(s, pattern) && patternCheck(pattern, s))
                result.add(s);
        }

        return result;
    }

    private boolean patternCheck(String word, String pattern) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (map.getOrDefault(word.charAt(i), pattern.charAt(i)) != pattern.charAt(i))
                return false;
            else
                map.put(word.charAt(i), pattern.charAt(i));
        }
        return true;
    }
}
// @lc code=end
