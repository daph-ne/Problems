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

    public class MergeSortedLists {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode newList = new ListNode(0);
            ListNode sorted = newList;

            while (l1 != null && l2 != null) {
                //Choose smaller value
                //Append to list
                if (l1.val < l2.val) {
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
            return newList.next;
        }
    }
}