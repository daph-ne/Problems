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
        int extra;
        int repeated = 0;
        String array = "1";
        if(input2.length > input1.length) {
            int[] temp = input2;
            input2 = input1;
            input1 = temp;
            array = "2";
        }
        for(int i = 0; i < input1.length; i++) {
            for(int j = 0; j <input2.length; j++) {
                if(input1[i] == input2[j]) {
                    repeated++;
                }
            }
            if(repeated == 0) {
                extra = input1[i];
                i = i+1;
                System.out.println(extra + " is the extra element in array " + array + " at index " + i + ".");
            }
            repeated = 0;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{10, 20, 30, 12, 5};
        int[] input2 = new int[]{10, 5, 30, 20};
        FindingExtraElement exEl = new FindingExtraElement();
        exEl.extraElement(input1, input2);
    }
}
