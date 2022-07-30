/*
 * @lc app=leetcode id=916 lang=java
 *
 * [916] Word Subsets
 */

// @lc code=start
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String s : words2) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                temp.put(s.charAt(i), temp.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> e : temp.entrySet()) {
                if (map.containsKey(e.getKey())) {
                    map.put(e.getKey(), Math.max(e.getValue(), map.get(e.getKey())));
                } else {
                    map.put(e.getKey(), e.getValue());
                }
            }
        }

        for (String s : words1) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            boolean universal = true;
            for (int i = 0; i < s.length(); i++) {
                map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (map1.containsKey(e.getKey()) == false) {
                    universal = false;
                    break;
                } else {
                    if (e.getValue() > map1.get(e.getKey())) {
                        universal = false;
                        break;
                    }
                }
            }

            if (universal)
                result.add(s);
        }

        return result;
    }
}
// @lc code=end
