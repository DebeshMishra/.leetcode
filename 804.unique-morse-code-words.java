/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.." };

        Set<String> uniqueCodes = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (Character c : word.toCharArray())
                sb.append(morseCode[c - 'a']);

            uniqueCodes.add(sb.toString());
        }

        return uniqueCodes.size();
    }
}
// @lc code=end
