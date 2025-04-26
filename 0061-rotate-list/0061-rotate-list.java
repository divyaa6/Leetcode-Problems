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
    public ListNode rev(ListNode head){
        ListNode p=null,c=head,n;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev=null;
        if(head==null)
        return null;
        if(head.next==null || k==0)
        return head;
        
        int n=0,o=k;

        head=rev(head);
        ListNode temp=head;
        while(k>0 && temp!=null){
            
            if(k==1){
                prev=temp;
            }
            if(temp.next==null){
                k=o%(n+1);
                if(k==0){
                    return rev(head);
                }
                temp=head;
            }
            else{
            temp=temp.next;
            k--;
            n++;
            }
        }
        if(prev!=null)
            prev.next=null;

        ListNode newhead=rev(head);
        ListNode sechead=rev(temp);
        head.next=sechead;
        return newhead;

        
    }
}