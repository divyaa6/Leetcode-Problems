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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        return head;

        ListNode odd=head,eve=head.next,stop=head.next;

        while(stop!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            eve.next=eve.next.next;
            eve=eve.next;

            if(odd.next==null || odd.next.next==null){    
            odd.next=stop;
            stop=null;
            }           
                
        }
        return head;

        
    }
}