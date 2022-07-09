/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        return sb.toString().equals(sb.reverse().toString());

        /*
         * s = s.replaceAll("[^a-zA-Z0-9]", "");
         * 
         * for(int i=s.length()-1; i>=0; i--){
         * sb.append(s.charAt(i));
         * }
         * 
         * if(sb.toString().equals(s))
         * return true;
         * else
         * return false;
         */
    }
}
// @lc code=end
