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
            if(input.charAt(k) >= 0 && input.charAt(k) < 9) {
                pair[1] = input.charAt(k);
                k++;
                if(input.charAt(k) >= 0 && input.charAt(k) < 9) {
                    pair[1] += input.charAt(k);
                    k++;
                }
            } else {
                pair[0] = input.charAt(k);
                k++;
            }
            System.out.println(pair[0]);
            System.out.println(pair[1]);
            int times = pair[1];
            System.out.println(times);
            int j = 0;
            while(j < times) {
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
