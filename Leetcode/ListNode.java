/**
 *  Link - https://leetcode.com/problems/merge-two-sorted-lists/
 *  Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Example 1:
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: l1 = [], l2 = []
 * Output: []
 *
 * Example 3:
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 *
 * Constraints:
 *     The number of nodes in both lists is in the range [0, 50].
 *     -100 <= Node.val <= 100
 *     Both l1 and l2 are sorted in non-decreasing order.
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode newList = new ListNode(0);
         ListNode sorted = newList;

         while (l1 != null && l2 != null) {
             //Choose smaller value
             //Append to list
             if (l1.val <= l2.val) {
                 sorted.next = l1;
                 //Move sorted pointer forward
                 sorted = sorted.next;
                 //Move the l1 pointer forward
                 l1 = l1.next;
             } else {
                 sorted.next = l2;
                 sorted = sorted.next;
                 l2 = l2.next;
             }
         }

         //Append the remaining when one list is empty
         if (l1 != null) {
             while (l1 != null) {
                 sorted.next = l1;
                 sorted = sorted.next;
                 l1 = l1.next;
             }
         }
         if (l2 != null) {
             while (l2 != null) {
                 sorted.next = l2;
                 sorted = sorted.next;
                 l2 = l2.next;
             }
         }
         while(sorted != null) {
             System.out.print(sorted.val + " ");
             sorted = sorted.next;
         }
    }

    private ListNode convertArrayToList(int[] array) {
        ListNode start = new ListNode(array[0]);
        ListNode ln = start;
        this.val = array[0];
        ln.val = val;
        for(int i = 1; i < array.length; i++) {
            ln.next = new ListNode(array[i]);
        }
        return ln;
    }

    public static void main(String[] args){
        int[] array1 = new int[]{1,2,4};
        int[] array2 = new int[]{1,3,4};
        ListNode ls = new ListNode();
        ListNode list1 = ls.convertArrayToList(array1);
        ListNode list2 = ls.convertArrayToList(array2);
        ls.mergeTwoLists(list1, list2);
    }
}