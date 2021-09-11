/*21. Merge Two Sorted Lists
Easy

Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 

Example 1:

Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:

Input: l1 = [], l2 = []
Output: []

Example 3:

Input: l1 = [], l2 = [0]
Output: [0]*/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode headNode;
        if (l1.val <= l2.val) {
            headNode = l1;
            l1 = l1.next;
        } else {
            headNode = l2;
            l2 = l2.next;
        }

        ListNode ans = headNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                headNode.next = l1;
                l1 = l1.next;
            } else {
                headNode.next = l2;
                l2 = l2.next;
            }
            headNode = headNode.next;
        }

        if (l1 == null)
            headNode.next = l2;
        else
            headNode.next = l1;
        return ans;
    }
}
