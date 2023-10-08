/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size=Math.abs(size(headA)-size(headB));
        if(size(headA)>size(headB)){
            for(int i=0;i<size;i++){
                headA=headA.next;
            }
        }
        else{
            for(int i=0;i<size;i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int size(ListNode n){
        int s=0;
        while(n!=null){
            s++;
            n=n.next;
        }
        return s;
    }
}