/**
* Link - https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
* 	Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
*   1. 5 if a perfect square
*   2. 4 if multiple of 4 and divisible by 6
*   3. 3 if even number
*
* And sort the numbers based on the weight and print it as follows
* <10,its_weight>,<36,its weight><89,its weight>
*/

class SumOfWeights {

    private void calculateWeights(int[] input) {
        int[] weightArr = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            weightArr[i] = 0;
            int sq = (int)Math.sqrt(input[i]);
            if(sq * sq == input[i]) {
                weightArr[i] = weightArr[i] + 5;
            }
            if(input[i]%4 == 0 && input[i]%6 == 0) {
                weightArr[i] = weightArr[i] + 4;
            }
            if(input[i]%2 == 0) {
                weightArr[i] = weightArr[i] + 3;
            }
        }
        sortWeights(weightArr, input);
    }

    private void sortWeights(int[] weightArr, int[] input){
        for(int i = 0; i < input.length; i++) {
            for(int j = i+1; j < input.length; j++) {
                if(weightArr[i] > weightArr[j]) {
                    int temp1 = weightArr[i];
                    weightArr[i] = weightArr[j];
                    weightArr[j] = temp1;
                    int temp2 = input[i];
                    input[i] = input[j];
                    input[j] = temp2;
                }
            }
            System.out.println("<" + input[i] + "," + weightArr[i] + ">");
        }
    }

    public static void main(String[] args){
           int[] input = new int[]{10, 36, 54, 89, 12};
           SumOfWeights weights = new SumOfWeights();
           weights.calculateWeights(input);
    }
}
