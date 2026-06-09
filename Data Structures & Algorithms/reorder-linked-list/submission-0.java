/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        
        //Find middle
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse second half of List
        ListNode curr = head;
        ListNode curr2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(curr2 != null){
            ListNode n = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = n;
        }

        //Merge both lists
        curr2 = prev;
        while(curr2 != null){
            ListNode temp1 = curr.next;
            ListNode temp2 = curr2.next;

            curr.next = curr2;
            curr2.next = temp1;

            curr = temp1;
            curr2 = temp2;

        }


    }
}
