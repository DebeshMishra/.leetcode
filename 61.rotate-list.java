/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        ListNode tail = head;
        int n;
        for (n = 1; tail.next != null; n++) {
            tail = tail.next;
        }
        tail.next = head;

        k %= n;

        ListNode firstNode = head;
        ListNode result = head;
        for (int i = 1; i < n - k; i++) {
            result = result.next;
        }
        firstNode = result.next;
        result.next = null;

        // ListNode firstNode = new ListNode(0);
        // ListNode resultHead = new ListNode(0,firstNode);
        // ListNode result = resultHead;

        /*
         * for(int i=0;i<k;i++){
         * while(head!=null){
         * if(head.next!=null){
         * ListNode nextNode = head.next;
         * result.next = nextNode;
         * head = head.next;
         * result = result.next;
         * }
         * else{
         * firstNode = head;
         * }
         * }
         * }
         */

        return firstNode;
    }
}
// @lc code=end
