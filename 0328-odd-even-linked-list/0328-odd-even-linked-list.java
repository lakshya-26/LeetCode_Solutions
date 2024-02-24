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
     public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        else{
            ListNode t1 = head;
            ListNode t2 = head.next;
            ListNode t3 = head.next;
            
            while(t1!=null && t2!=null && t2.next!=null){
                t1.next = t2.next;
                t2.next = t1.next.next;
                t1.next.next = t3;
                t1 = t1.next;
                t2 = t2.next;
                
            }
            return head;
        }
    }
}