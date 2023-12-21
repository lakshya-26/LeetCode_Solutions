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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
            ListNode current = head;
            int length=0;
            while(current!=null){
                current=current.next;
                length++;
            }
            if(n==length){
                return head.next;
            }
            int previous = length-n;
            int count=1;
            current = head;
            while(count<previous){
                current = current.next;
                count++;
            }
            current.next=current.next .next;
            return head;
        }
    }
