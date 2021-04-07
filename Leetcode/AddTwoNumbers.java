/**
 * Link - https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 * Constraints:
 *
 *     The number of nodes in each linked list is in the range [1, 100].
 *     0 <= Node.val <= 9
 *     It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       public class ListNode {
         int val;
         ListNode next;
         ListNode(int val) {
             this.val = val;
         }
       }
        if (l1 == null && l2 == null) {
            return null;
        }
        int carry = 0;
        int num1;
        int num2;
        ListNode result = new ListNode(0);
        ListNode x = new ListNode(l1.val);
        ListNode y = new ListNode(l2.val);
        ListNode current = result;
        while (x != null || y != null) {
            if (x == null) {
                num1 = 0;
            } else {
                num1 = x.val;
            }

            if (y == null) {
                num2 = 0;
            } else {
                num2 = y.val;
            }

            int sum = num1 + num2 + carry;

            if (sum > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            int z = sum % 10;

            current.next = new ListNode(z);
            current = current.next;

            if (x != null) {
                x = x.next;
            }
            if (y != null) {
                y = y.next;
            }
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }
}
