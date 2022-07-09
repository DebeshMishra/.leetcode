/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
import java.util.stream.Collectors;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<Character> common = new ArrayList<Character>();
        char[] currentString;
        // ArrayList<Character> result = new ArrayList<Character>();

        if (strs.length == 1) {
            return strs[0];
        }

        if (strs != null) {
            common = strs[0].chars().mapToObj(e -> (char) e).collect(Collectors.toList());
            int j = 0;

            for (int i = 1; i < strs.length; i++) {
                currentString = strs[i].toCharArray();
                for (j = 0; j < Math.min(common.size(), currentString.length); j++) {
                    if (common.size() != 0 && common.get(j) != currentString[j]) {
                        common.set(j, ' ');
                        break;
                    }
                }
                common = common.subList(0, j);
            }

            /*
             * for (int i = 0; i < common.size(); ++i) {
             * if (common.get(i) == ' ') {
             * break;
             * }
             * result.add(common.get(i));
             * }
             */

            return new String(getStringRepresentation(common));
        }

        else {
            return "";
        }
    }

    String getStringRepresentation(List<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
// @lc code=end
