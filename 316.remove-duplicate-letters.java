/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++)
            lastIndex[s.charAt(i) - 'a'] = i;
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (seen[c])
                continue;

            while (!stack.isEmpty() && stack.peek() > c && i < lastIndex[stack.peek()])
                seen[stack.pop()] = false;
            stack.push(c);
            seen[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append((char) (stack.pop() + 'a'));
        }

        return sb.reverse().toString();
        /*
         * char[] chars = s.toCharArray();
         * Set<Character> charSet = new LinkedHashSet<Character>();
         * char smallest = chars[0];
         * String res=" ";
         * 
         * for(char c:chars){
         * charSet.add(c);
         * }
         * StringBuilder sb1 = new StringBuilder();
         * for (Character character : charSet) {
         * sb1.append(character);
         * }
         * 
         * charSet.clear();
         * 
         * for(int i=1;i<chars.length;i++){
         * if(chars[i]<smallest){
         * smallest = chars[i];
         * }
         * }
         * 
         * int index = new String(chars).indexOf(smallest);
         * 
         * for(int i=index;i<chars.length;i++){
         * charSet.add(chars[i]);
         * }
         * 
         * StringBuilder sb = new StringBuilder();
         * for (Character character : charSet) {
         * sb.append(character);
         * }
         * 
         * charSet.clear();
         * 
         * StringBuilder result = new StringBuilder();
         * 
         * for(int i=0;i<index;i++){
         * if(sb.toString().indexOf(chars[i])==-1){
         * charSet.add(chars[i]);
         * }
         * }
         * for(int i=index;i<chars.length;i++){
         * charSet.add(chars[i]);
         * }
         * for (Character character : charSet) {
         * result.append(character);
         * }
         * 
         * 
         * if(result.toString().compareTo(sb1.toString())>0){
         * return sb1.toString();
         * }
         * else{
         * return result.toString();
         * }
         */
    }
}
// @lc code=end
