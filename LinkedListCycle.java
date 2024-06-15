/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

public class LinkedListCycle {
    public static void main(String[] args) {
        //testcase head=[3,2,0,-4] cycle at 1 index from last index
    }
    static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
*/