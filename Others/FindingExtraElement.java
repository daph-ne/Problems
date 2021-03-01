/**
 * link - https://www.geeksforgeeks.org/zoho-interview-experience-set-27-off-campus-software-developer/
 * Find the extra element and its index
 *
 * Input : [ 10, 20, 30, 12, 5 ]
 *     [ 10, 5, 30, 20 ]
 * Output : 12 is the extra element in array 1 at index 4
 *
 * Input : [ -1, 0, 3, 2 ]
 *     [ 3, 4, 0, -1, 2 ]
 * Output : 4 is the extra element in array 3 at index 5
 */

public class FindingExtraElement {

    private void extraElement(int[] input1, int[] input2) {
        int extra = 0;
        int[] array1 = input1;
        int[] array2 = input2;
        //Sorting both the arrays
        for(int i = 0; i < input1.length; i++) {
            for(int j = i + 1; j < input1.length; j++) {
                if(input1[i] > input1[j]) {
                    int temp = input1[i];
                    input1[i] = input1[j];
                    input1[j] = temp;
                }
            }
        }
        for(int i = 0; i < input2.length; i++) {
            for(int j = i + 1; j < input2.length; j++) {
                if(input2[i] > input2[j]) {
                    int temp = input2[i];
                    input2[i] = input2[j];
                    input2[j] = temp;
                }
            }
        }
        //Comparing index of both the arrays
        //Using this method to reduce the time complexity
        if(input2.length > input1.length) {
            for(int i = 0; i < input2.length; i++) {
                if(input2[i] != input1[i]) {
                    extra = input2[i];
                    break;
                }
            }
            for(int i = 0; i < array2.length; i++) {
                if(array2[i] == extra) {
                    i = i + 1;
                    System.out.println(extra + " is the extra element in array 2 at index " + i + ".");
                }
            }
        } else {
            for(int i = 0; i < input1.length; i++) {
                if(input1[i] != input2[i]) {
                    extra = input1[i];
                    break;
                }
            }
        }
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] == extra) {
                i = i + 1;
                System.out.println(extra + " is the extra element in array 1 at index " + i + ".");
            }
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{10, 20, 30, 12, 5};
        int[] input2 = new int[]{10, 5, 30, 20};
        FindingExtraElement exEl = new FindingExtraElement();
        exEl.extraElement(input1, input2);
    }
}
