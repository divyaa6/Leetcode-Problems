/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        return false;

        ArrayList<ListNode> arr=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null){
            if(arr.contains(temp))
            return true;

            arr.add(temp);
            temp=temp.next;
        }
        return false;
        
    }
}