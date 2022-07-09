/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase() == word || word.toLowerCase() == word)
            return true;
        else if (Character.isUpperCase(word.charAt(0)) && isStringLowerCase(word.substring(1)))
            return true;
        else
            return false;
    }

    private static boolean isStringLowerCase(String str) {
        // convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            // if any character is not in lower case, return false
            if (!Character.isLowerCase(charArray[i]))
                return false;
        }
        return true;
    }
}
// @lc code=end
