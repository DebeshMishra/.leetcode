/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 != null)
            return list2;
        else if (list2 == null && list1 != null)
            return list1;
        else if (list1 == null && list2 == null)
            return list1;

        else {
            ListNode tail = list1;
            for (int i = 1; tail.next != null; i++) {
                tail = tail.next;
            }
            tail.next = list2;

            ListNode current = list1, index = null;
            int temp;

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.val > index.val) {
                        temp = current.val;
                        current.val = index.val;
                        index.val = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }

            return list1;
        }
    }
}
// @lc code=end
