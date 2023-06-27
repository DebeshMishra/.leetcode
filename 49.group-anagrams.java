/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            int[] count = new int[26];
            for (char c : strs[i].toCharArray()) {
                count[c-'a']++;
            }
            String key = new String(Arrays.toString(count));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList(map.values());


        //using sorting
        // HashMap<String, List<String>> map = new HashMap();
        // for (int i = 0; i < strs.length; i++) {
        //     String s = strs[i];
        //     char[] temp = s.toCharArray();
        //     Arrays.sort(temp);
        //     String s1 = new String(temp);
        //     if (map.get(s1) != null)
        //         map.get(s1).add(s);
        //     else {
        //         map.put(s1, new ArrayList());
        //         map.get(s1).add(s);
        //     }
        // }
        // return new ArrayList(map.values());
    }
}
// @lc code=end
