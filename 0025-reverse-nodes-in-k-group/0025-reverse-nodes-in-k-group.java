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
        ListNode c=head,p=null,n;

        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public ListNode getk(ListNode temp,int k){
        k-=1;

        while(temp!=null && k>0){
            temp=temp.next;
            k-=1;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            ListNode kth=getk(temp,k);

            if(kth==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }

            ListNode nextnode=kth.next;
            kth.next=null;
            rev(temp);

            if(temp==head)
            head=kth;
            else
            prev.next=kth;

            prev=temp;
            temp=nextnode;

        }
        return head;
        
    }
}