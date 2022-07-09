/*
 * @lc app=leetcode id=946 lang=java
 *
 * [946] Validate Stack Sequences
 */

// @lc code=start
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();

        for (int i = 0, j = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}
// @lc code=end
