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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = carry+l1.val+l2.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while(l1!=null){
            int sum = carry+l1.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2!=null){
            int sum = carry+l2.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            l2 = l2.next;
            temp = temp.next;
        }
        if(carry!=0){
            temp.next = new ListNode(1);
        }
        return dummy.next;

    }
}
