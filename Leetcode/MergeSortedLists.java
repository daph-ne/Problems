/**
 *  Link - https://leetcode.com/problems/merge-two-sorted-lists/
 *  Definition for singly-linked list.
 */
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode sorted = newList;

        while(l1 != null && l2 != null){
            //Choose smaller value
            //Append to list
            if(l1.val < l2.val){
                sorted.next = l1;
                //Move sorted pointer forward
                sorted = sorted.next;
                //Move the l1 pointer forward
                l1 = l1.next;
            }
            else {
                sorted.next = l2;
                sorted = sorted.next;
                l2 = l2.next;
            }
        }

        //Append the remaining when one list is empty
        if(l1 != null){
            while(l1 != null){
                sorted.next = l1;
                sorted = sorted.next;
                l1 = l1.next;
            }
        }
        if(l2 != null){
            while(l2 != null){
                sorted.next = l2;
                sorted = sorted.next;
                l2=l2.next;
            }
        }
        return newList.next;
    }
}
