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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;

        Stack<Integer> st= new Stack<>();
        ListNode temp=head;

        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }

        int left=0,right=st.size();
        while(left<(right/2)){
            if(st.get(left)!=st.pop())
            return false;
            left++;
        }
        return true;
        
    }
}