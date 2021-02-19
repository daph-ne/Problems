/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
 *  Write a program to sort the elements in odd positions in descending order and elements in ascending order
 *
 * Eg 1: Input: 13,2,4,15,12,10,5
 *         Output: 13,2,12,10,5,15,4
 * Eg 2: Input: 1,2,3,4,5,6,7,8,9
 *         Output: 9,2,7,4,5,6,3,8,1
 */

import java.util.Arrays;
public class SortOddEvenPositions<input> {
    private void sortedArr(int[] input) {
        oddArrSort(input); //Sort odd positions of input separately
        evenArrSort(input); //Sort even positions of input separately
        printSortedArr(input);
    }

    private void printSortedArr(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    private int[] oddArrSort(int[] input) {
            for(int i = 0; i < input.length; i = i + 2) {
                for(int j = i + 2; j < input.length; j= j+2) {
                    if (input[j] > input[i]) {
                        int temp = input[i];
                        input[i] = input[j];
                        input[j] = temp;
                    }
                }
            }
        return input;
        }

    private int[] evenArrSort(int[] input) {
        for(int i = 1; i < input.length; i = i + 2) {
            for(int j = i + 2; j < input.length; j= j+ 2) {
                if (input[j] < input[i]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = new int[] {13,2,4,15,12,10,5};
        SortOddEvenPositions sort = new SortOddEvenPositions();
        sort.sortedArr(input);
    }
}
