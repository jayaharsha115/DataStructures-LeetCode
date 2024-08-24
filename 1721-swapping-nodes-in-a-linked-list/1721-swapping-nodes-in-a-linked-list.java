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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(k>count) return head;
        if(k==(count-k+1)) return head;
        ListNode beg=head;
        ListNode end=head;
        ListNode beg_prev=null;
        ListNode end_prev=null;
        for(int i=1;i<k;i++){
            beg_prev=beg;
            beg=beg.next;
        }
        for(int i=1;i<(count-k+1);i++){
            end_prev=end;
            end=end.next;
        }
        if(beg_prev!=null){
            beg_prev.next=end;
        }
        if(end_prev!=null){
            end_prev.next=beg;
        }
        ListNode a=beg.next;
        beg.next=end.next;
        end.next=a;
        
        if(k==1) head=end;
        if(k==count) head=beg;
        
        return head;
    }
}