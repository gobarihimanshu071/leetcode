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

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                temp=temp.next;
                left=left.next;
            }
            else{
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=left;
                temp=temp.next;
                left=left.next;
        }
        while(right!=null){
            temp.next=right;
                temp=temp.next;
                right=right.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next=null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
}