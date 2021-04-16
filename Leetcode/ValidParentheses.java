import java.util.Stack;

/**
 * Link - https://leetcode.com/problems/valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 *
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 104
 *     s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length()%2 != 0 || s.length() == 0) {
            return false;
        }
        Stack<Character> parentheses = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    parentheses.push(s.charAt(i));
                    break;
                case ')':
                    if (!parentheses.isEmpty() && parentheses.peek() == '(') {
                        parentheses.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (!parentheses.isEmpty() && parentheses.peek() == '[') {
                        parentheses.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if (!parentheses.isEmpty() && parentheses.peek() == '{') {
                        parentheses.pop();
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return parentheses.isEmpty();
    }
}
