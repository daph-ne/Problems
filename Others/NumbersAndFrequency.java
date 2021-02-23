/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
 *  Write a program to give the following output for the given input
 *
 * Eg 1: Input: a1b10
 *        Output: abbbbbbbbbb
 * Eg: 2: Input: b3c6d15
 *           Output: bbbccccccddddddddddddddd
 * The number varies from 1 to 99.
 */

public class NumbersAndFrequency {

    private void numsAndFreq(String input) {
        String output = "";
        int k = 0;
        int[] pair = new int[2];

        for(int i = 0; i < input.length(); i++) {
            boolean check = Character.isDigit(input.charAt(k));
            if(check) {
                pair[1] = input.charAt(k);
                k++;
                if(Character.isDigit(input.charAt(k))) {
                    pair[1] += input.charAt(k);
                    k++;
                }
            } else {
                pair[0] = input.charAt(k);
                k++;
            }
            int j = 1;
            while(j < pair[1]) {
                output += pair[0];
                j++;
            }
            pair = new int[2];
        }
    }

    public static void main(String[] args) {
        String input = "a1b10";
        NumbersAndFrequency nf = new NumbersAndFrequency();
        nf.numsAndFreq(input);
    }
}
