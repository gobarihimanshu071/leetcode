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
        int n=0;
        int m=0;
        ListNode h1=headA;
        ListNode h2=headB;
        while(h1!=null){
            h1=h1.next;
            n++;
        }
        while(h2!=null){
            h2=h2.next;
            m++;
        }
        ListNode h3=headA;
        ListNode h4=headB;
        if(m>n){
            for(int i=0;i<m-n;i++){
                h4=h4.next;
            }
        }
        else{
            for(int i=0;i<n-m;i++){
                h3=h3.next;
            }
        }
        while(h3!=null){
            if(h3==h4)return h3;
            h3=h3.next;
            h4=h4.next;
        }
        return null;
    }
}