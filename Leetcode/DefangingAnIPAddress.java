/**
 * Link - https://leetcode.com/problems/defanging-an-ip-address/
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example 1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 * Constraints:
 *      The given address is a valid IPv4 address.
 */

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String str = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.') {
                str += "[.]";
            }
            else {
                str += address.charAt(i);
            }
        }
        System.out.println(str);
    }
}

