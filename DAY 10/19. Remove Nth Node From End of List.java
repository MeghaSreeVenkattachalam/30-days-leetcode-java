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
        ListNode temp = head;
        ListNode nxt = null;
        ListNode prev = null;
        while(temp!=null){
            nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        head = prev;
        ListNode rev = head;
        if(n==1){
            head = head.next;
        }else{
        for(int i=1;i<n-1;i++){
            rev = rev.next;
        }
        rev.next = rev.next.next;
        }

        temp = head;
        prev = null;
        while(temp!=null){
            nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        head = prev;


        return head;
    }
}
