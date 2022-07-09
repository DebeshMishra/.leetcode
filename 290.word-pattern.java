/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList<Character> ucp = new ArrayList<Character>();
        List<String> uws = new ArrayList<String>();
        Map<Character, String> match = new HashMap<Character, String>();
        ArrayList<Character> patternForMatching = new ArrayList<Character>();
        String finalMatch = "";

        ucp = uniqueCharacters(pattern);
        uws = uniqueWords(s);

        if (ucp.size() != uws.size()) {
            return false;
        } else {
            for (int i = 0; i < ucp.size(); i++) {
                match.put(ucp.get(i), uws.get(i));
            }
            for (int i = 0; i < pattern.length(); i++) {
                patternForMatching.add(pattern.charAt(i));
            }
            for (int i = 0; i < patternForMatching.size(); i++) {
                finalMatch = finalMatch + match.get(patternForMatching.get(i)) + " ";
            }
            finalMatch = finalMatch.substring(0, finalMatch.length() - 1);

            return s.equals(finalMatch);
        }
    }

    public List<String> uniqueWords(String test) {
        String[] words = test.split(" ");
        List<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
        for (int i = 1; i < uniqueWords.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (uniqueWords.get(i).equals(uniqueWords.get(j))) {
                    uniqueWords.remove(i);
                    i--;
                    break;
                }
            }
        }
        return uniqueWords;
    }

    public ArrayList<Character> uniqueCharacters(String test) {
        ArrayList<Character> temp = new ArrayList<Character>();
        for (int i = 0; i < test.length(); i++) {
            if (temp.indexOf(test.charAt(i)) == -1) {
                temp.add(test.charAt(i));
            }
        }
        return temp;
    }
}
// @lc code=end
