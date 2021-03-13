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

    //convert it into an array
    private char[] convertToArray(String address) {
        char[] addressArr = address.toCharArray();
        for (int i = 0; i < addressArr.length; i++) {
            if (addressArr[i] == '.') {
                addressArr[i] = "[.]";
            }
        }
        return addressArr;
    }
    //to return as a string
    private void defangedAddress(char[] arrayOfAddress) {
        String ipAddress = "";
        for(int i = 0; i < arrayOfAddress.length; i++) {
            ipAddress += arrayOfAddress[i];
        }
        System.out.println(ipAddress);
    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        DefangingAnIPAddress ip = new DefangingAnIPAddress();
        char[] arrayOfAddress = ip.convertToArray(address);
        ip.defangedAddress(arrayOfAddress);
    }
}
