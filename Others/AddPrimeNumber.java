import java.util.Arrays;

/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-experience-set-27-off-campus-software-developer/
 *  Find the least prime number that can be added with first array element that makes them divisible by second array elements at respective index (check for prime numbers under 1000, if exist return -1 as answer) & (Consider 1 as prime number)
 *
 * Input : [ 21, 7 ]
 *     [ 11, 5 ]
 * Output : [ 1, 3 ]
 *
 * Explanation :
 * (21 + ?) % 11
 * ( 7 + ?) % 5
 */

public class AddPrimeNumber {

    private void primeNumber(int[] input1, int[] input2) {
        int remainder;
        int primeNum;
        int[] output = new int[input1.length];
        for(int i = 0; i < input1.length; i++) {
            remainder = input1[i] % input2[i]; //Find remainder when divided
            primeNum = input2[i] - remainder; //To find how much should be added to the reminder
            output[i] = primeNum;
        }
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{21, 7};
        int[] input2 = new int[]{11, 5};
        AddPrimeNumber num = new AddPrimeNumber();
        num.primeNumber(input1, input2);
    }
}
