/**
 * Link - https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 *
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 1000
 *     s consist of only digits and English letters (lower-case and/or upper-case),
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j > i; j--) {
                String temp = s.substring(i, j+1);
                if(temp.length() > ans.length() && palindrome(temp)) {
                    ans = temp;
                    break;
                }
            }
        }
        return (ans.length()>0) ? ans : s.charAt(0) + "";
    }
    private boolean palindrome(String temp) {
        int i = 0;
        int j = temp.length() - 1;
        while (j > i) {
            if (temp.charAt(i) == temp.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
