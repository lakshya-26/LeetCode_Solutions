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
        if(head==null || head.next==null){
            return null;
        }else{
            ListNode t1 = null;
            ListNode t2 = head;
            ListNode t3 = head;
            while(t3!=null && t3.next!=null){
                t1=t2;
                t2=t2.next;
                t3=t3.next.next;
            }
            t1.next=t2.next;
            return head;   
        }
            
    }
}