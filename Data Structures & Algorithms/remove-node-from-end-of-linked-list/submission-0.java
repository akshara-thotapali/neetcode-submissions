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
    public ListNode reverseList(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=reverseList(head);
        if(n==1)
        {
            return reverseList(temp.next);
        }
          int count=1;
          ListNode curr=null;
          ListNode org=temp;
          while(temp!=null && count<n)
          {
            count++;
            curr=temp;
            temp=temp.next;
          }
          if(curr!=null && temp!=null){
          curr.next=temp.next;
          temp.next=null;
          }
          return reverseList(org);
}
    }
