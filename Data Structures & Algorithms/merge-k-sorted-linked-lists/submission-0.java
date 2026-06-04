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
    public ListNode mergesort(ListNode h1,ListNode h2)
    {
        ListNode t1=h1;
        ListNode t2=h2;
        ListNode res=new ListNode();
        ListNode head=res;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                ListNode temp=new ListNode(t1.val);
                res.next=temp;
                res=res.next;
                t1=t1.next;
            }
            else{
              ListNode temp=new ListNode(t2.val);
                res.next=temp;
                res=res.next;
                t2=t2.next; 
            }
        }
        while(t1!=null)
        {
           ListNode temp=new ListNode(t1.val);
                res.next=temp;
                res=res.next;
                t1=t1.next; 
        }
        while(t2!=null)
        {
          ListNode temp=new ListNode(t2.val);
                res.next=temp;
                res=res.next;
                t2=t2.next;  
        }
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
         int n=lists.length;
         if(n==0)
         {
            return null;
         }
         if(n==1)
         {
            return lists[0];
         }
         ListNode head1=lists[0];
         ListNode head2=lists[1];
         ListNode head=mergesort(head1,head2);
         for(int i=2;i<n;i++)
         {
            ListNode temp=head=mergesort(head,lists[i]);
            head=temp;
         }
         return head;
    }
}
