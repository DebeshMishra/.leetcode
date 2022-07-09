/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node, Node> nodeMap = new HashMap<>();

        Node dummy = head;

        while (dummy != null) {
            nodeMap.put(dummy, new Node(dummy.val));
            dummy = dummy.next;
        }

        for (Node key : nodeMap.keySet()) {
            Node newNode = nodeMap.get(key);
            newNode.next = nodeMap.get(key.next);
            newNode.random = nodeMap.get(key.random);
        }

        return nodeMap.get(head);
    }
}
// @lc code=end
