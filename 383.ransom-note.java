/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magFreq = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            magFreq.put(c, magFreq.getOrDefault(c, 0) + 1);
        }

        StringBuilder checkRansom = new StringBuilder(ransomNote);
        for (int i = ransomNote.length() - 1; i >= 0; i--) {
            if (magFreq.containsKey(ransomNote.charAt(i)) && magFreq.get(ransomNote.charAt(i)) != 0) {
                magFreq.put(ransomNote.charAt(i), magFreq.get(ransomNote.charAt(i)) - 1);
                checkRansom.deleteCharAt(i);
            }
        }

        return checkRansom.length() == 0;
    }
}
// @lc code=end
