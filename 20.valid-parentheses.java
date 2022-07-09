/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] charArr = s.toCharArray();

        if (charArr[0] == ')' || charArr[0] == ']' || charArr[0] == '}' || charArr.length % 2 != 0)
            return false;

        Stack<Character> charStack = new Stack();

        for (char c : charArr) {
            if (c == '{' || c == '(' || c == '[') {
                charStack.push(c);
            } else if (c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
            } else if (c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            } else if (c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            } else {
                charStack.push(c);
            }
            /*
             * switch(c){
             * case '(':
             * case '[':
             * case '{':
             * charStack.push(c);
             * break;
             * case ')':
             * if(!charStack.isEmpty() && charStack.peek()=='(')
             * charStack.pop();
             * break;
             * case ']':
             * if(!charStack.isEmpty() && charStack.peek()=='[')
             * charStack.pop();
             * break;
             * case '}':
             * if(!charStack.isEmpty() && charStack.peek()=='{')
             * charStack.pop();
             * break;
             * default: //not possible
             * }
             */
        }

        return charStack.isEmpty();
    }
}
// @lc code=end
