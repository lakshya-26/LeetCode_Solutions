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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        } else { 
            ListNode turtlePrev=null,turtle=head,rabbit=head;
            while(rabbit!=null && rabbit.next!=null) {
                turtlePrev=turtle;
                turtle=turtle.next;
                rabbit=rabbit.next.next;
            }
            turtlePrev.next=turtle.next;
            return head;
        }
    }
}