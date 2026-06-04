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
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
      ListNode slow=head;
      ListNode fast=head;
      ListNode temp=head;
      while(slow!=null && slow.next!=null && fast!=null && fast.next!=null)
      {
        temp=slow;
        slow=slow.next;
        fast=fast.next.next;
      }  
      if(fast!=null)
      {
        temp=slow;
        slow=slow.next;
      }
        temp.next=null;
        ListNode head2=reverseList(slow);
        temp=head;
        ListNode curr=head;
        while(temp!=null && head2!=null)
        {
            temp=temp.next;
            curr.next=head2;
            curr=curr.next;
            head2=head2.next;
            curr.next=temp;
            curr=curr.next;
        }
        
    }
}
