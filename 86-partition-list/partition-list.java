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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);

        ListNode l=dummy1;
        ListNode r=dummy2;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                l.next=new ListNode(temp.val);
                l=l.next;
            }
            else{
                r.next=new ListNode(temp.val);
                r=r.next;
            }
            temp=temp.next;
        }
        l.next=dummy2.next;
        return dummy1.next;
    }
}