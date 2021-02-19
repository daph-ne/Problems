/**
 *  Link - https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
 *  Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.
 *
 *     Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
 *          Output : {7, 1, 6, 2, 5, 3, 4}
 */
import java.util.Arrays;
public class AlternateMaxMin {

    private static void rearrangedInput(int[] input) {
        int[] rearrangedArr = new int[input.length];
        int j = 0;
        for(int i = 0; i < input.length; i = i+2){
            rearrangedArr[i] = input[input.length - 1 - j];
            if(i < input.length - 1) { //Otherwise it will go out of bound in arrays with odd number of elements
                rearrangedArr[i + 1] = input[i - j];
                j = j + 1;
            }
        }
        System.out.println(Arrays.toString(rearrangedArr));
    }

    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        AlternateMaxMin maxMin = new AlternateMaxMin();
        maxMin.rearrangedInput(input);
    }
}
