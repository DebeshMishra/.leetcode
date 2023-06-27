/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();

        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                if(sMap.containsKey(s.charAt(i)))
                    sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
                else
                    sMap.put(s.charAt(i),1);
            }
    
            for(int j=0;j<t.length();j++){
                if(tMap.containsKey(t.charAt(j)))
                    tMap.put(t.charAt(j),tMap.get(t.charAt(j))+1);
                else
                    tMap.put(t.charAt(j),1);
            }
    
            return sMap.equals(tMap);
        }
        
        else
            return false;

        //different approach
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // int[] counter = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     counter[s.charAt(i) - 'a']++;
        //     counter[t.charAt(i) - 'a']--;
        // }
        // for (int count : counter) {
        //     if (count != 0) {
        //         return false;
        //     }
        // }
        // return true;
    }
}
// @lc code=end
