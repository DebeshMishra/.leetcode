/*
 * @lc app=leetcode id=271 lang=java
 *
 * [271] Encode and Decode Strings
 */

// @lc code=start
public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        if(strs == null)
            return String.valueOf((char) 257);

        int encoder = 256;
        return String.join((char) encoder, strs);
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        if(str == (char) 257)
            return new ArrayList<String>();

        int decoder = 256;
        return Arrays.asList(str.split((char) decoder));
    }
}
// @lc code=end