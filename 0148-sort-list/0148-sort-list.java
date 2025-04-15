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
    public ListNode sortList(ListNode head) {
        List<Integer> set=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            set.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(set);
        temp=head;

        for(int num:set){
            temp.val=num;
            temp=temp.next;
        }
        return head;
        
    }
}