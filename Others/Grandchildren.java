/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
 * Given a two dimensional array of string like
 *
 *   <”luke”, “shaw”>
 *   <”wayne”, “rooney”>
 *   <”rooney”, “ronaldo”>
 *   <”shaw”, “rooney”>
 *
 * Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.
 */

import java.util.Arrays;
public class Grandchildren {
    static int grandchildren = 0;
    private void fatherChildArr(String[][] input, String childrenOf) {
        String[] childArr = new String[input.length];
        String[] fatherArr = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            childArr[i] = input[i][0];
            fatherArr[i] = input[i][1];
        }
        numOfGrandchildren(childrenOf, childArr, fatherArr);
    }

    private static void numOfGrandchildren(String childrenOf, String[] childArr, String[] fatherArr) {
        for(int i = 0; i < fatherArr.length; i++) {
            if(fatherArr[i] == childrenOf) {
                childrenOf = childArr[i];
                break;
            }
        }
        for(int j = 0; j < fatherArr.length; j++) {
            if(fatherArr[j] == childrenOf) {
                grandchildren++;
            }
        }
        System.out.print(grandchildren);
    }

    public static void main(String[] args) {
        String[][] input = new String[][]{{"luke", "shaw"},
                {"wayne", "rooney"},
                {"rooney", "ronaldo"},
                {"shaw", "rooney"}};
        String childrenOf = "ronaldo";
        Grandchildren grandchildren = new Grandchildren();
        grandchildren.fatherChildArr(input, childrenOf);
    }
}
