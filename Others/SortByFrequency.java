/**
 *  Link - https://www.geeksforgeeks.org/zoho-interview-experience-set-27-off-campus-software-developer/
 *   Sort the array elements in descending order according to their frequency of occurrence
 *
 *
 * Input : [ 2 2 3 4 5 12 2 3 3 3 12 ]
 * Output : 3 3 3 3 2 2 2 12 12 4 5
 *
 * Explanation : 3 occurred 4 times, 2 occurred 3 times, 12 occurred 2 times, 4 occurred 1 time, 5 occurred 1 time
 *
 * Input : [ 0 -1 2 1 0 ]
 * Output : 0 0 -1 1 2
 *
 * Note : sort single occurrence elements in ascending order
 */

public class SortByFrequency {

    private int[] sortInput(int[] input) {
        for(int i = 0; i < input.length; i++) {
            for(int j = i + 1; j < input.length; j++) {
                if(input[i] > input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    //count different numbers present
    private int numCount(int[] sortedInput) {
        int times = 1;
        for(int i = 1; i < sortedInput.length; i++) {
            if(sortedInput[i] != sortedInput[i-1]) {
                times++;
            }
        }
        return times;
    }

    private void findFreq(int[] sortedInput, int times) {
        int[] nums = new int[times];
        int[] freq = new int[times];
        int i = 0;
        int idx = 0;
        int repeats = 1;
        for(int j = 1; j < sortedInput.length; j++){
            nums[idx] = sortedInput[i];
            if(sortedInput[j] == sortedInput[i]) {
                repeats++;
                freq[idx] = repeats;
            } else {
                freq[idx] = repeats;
                i = j;
                repeats = 1;
                idx++;
            }
        }
        //sort the frequencies
        for(int k1 = 0; k1 < freq.length; k1++) {
            for(int k2 = k1 + 1; k2 < freq.length; k2++) {
                if(freq[k2] > freq[k1]){
                    int temp = freq[k1];
                    freq[k1] = freq[k2];
                    freq[k2] = temp;

                    temp = nums[k1];
                    nums[k1] = nums[k2];
                    nums[k2] = temp;
                }
                //ascending order when frequency is same
                if(freq[k2] == freq[k1]) {
                    if(nums[k2] < nums[k1]) {
                        int temp = nums[k1];
                        nums[k1] = nums[k2];
                        nums[k2] = temp;
                    }
                }
            }
        }
        //print as required
        int index = 0;
        for(int n = 0; n < times; n++) {
            for(int m = 0; m < freq[index]; m++) {
                System.out.print(" " + nums[index]);
            }
            index++;
        }
    }

    public static void main(String[] args) {
        int [] input = new int[]{2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
        SortByFrequency sort = new SortByFrequency();
        int[] sortedInput = sort.sortInput(input);
        int countNums = sort.numCount(sortedInput);
        sort.findFreq(sortedInput, countNums);
    }
}
