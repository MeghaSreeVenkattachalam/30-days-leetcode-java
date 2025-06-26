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
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        ListNode res = head;
        int mid = count/2;
        if(count == 1){
            head = null;
        }else if(count == 2){
            head.next = null;
        }
        for(int i=0;i<mid-1;i++){
            res = res.next;
        }if(res.next!=null && res.next.next!=null){
        res.next = res.next.next;
        }
        return head;
    }
}
