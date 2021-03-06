/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr!=null)
        {
           ListNode temp=curr;
            while(temp!=null && temp.val==curr.val)
            {
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
        return head;
    }
}
