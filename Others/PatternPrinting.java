/**
 * Print the pattern
 *
 * Example 1:
 * Input: 3
 * Output:
 *         1
 *       2 3 2
 *     4 5 6 5 4
 *
 * Input: 4
 * Output:
 *          1
 *        2 3 2
 *      4 5 6 5 4
 *    7 8 9 10 9 8 7
 */

public class PatternPrinting {

    private static void printPattern(int input) {
        int row = input;
        int num = 1;
        int rightNum;
        for(int i = 1; i <= row; i++) {
            for(int j = 2 * (row -i); j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            rightNum = num - 2;
            for(int j = 2; j <= i; j++) {
                System.out.print(rightNum + " ");
                rightNum--;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 4;
        printPattern(input);
    }
}
