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
    
    public static ListNode findNthNode(ListNode head, int k){
        int cnt = 1;
        while(head!=null){
            if(cnt == k){
                return head;
            }
            cnt++;
            head = head.next;
        }
        return head;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len == 0) return head;
        k = k%len;
        tail.next = head;

        ListNode newNode = findNthNode(head, len-k);
        head = newNode.next;
        newNode.next = null;
        return head; 
    }
}