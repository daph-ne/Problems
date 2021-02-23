/**
 *  Link - https://www.geeksforgeeks.org/zoho-interview-set-3-campus/
 *  Given two sorted arrays, merge them such that the elements are not repeated
 *
 * Eg 1: Input:
 *         Array 1: 2,4,5,6,7,9,10,13
 *         Array 2: 2,3,4,5,6,7,8,9,11,15
 *        Output:
 *        Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */

import java.util.Arrays;

public class MergeSortedArrays {
    private void mergedAndSorted(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        mergeTheArrays(array1, array2, mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    private void mergeTheArrays(int[] array1, int[] array2, int[] mergedArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < mergedArray.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
                k++;
            } else if (array2[j] < array1[i]) {
                mergedArray[k] = array2[j];
                j++;
                k++;
            } else if(array1[i] == array2[j]) {
                mergedArray[k] = array1[i];
                i++;

                k++;
            }
            if( k == mergedArray.length - 1) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[] {2,4,5,6,7,9,10,13};
        int[] array2 = new int[] {2,3,4,5,6,7,8,9,11,15};
        MergeSortedArrays arrays = new MergeSortedArrays();
        arrays.mergedAndSorted(array1, array2);
    }
}
