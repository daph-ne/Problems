import java.util.Arrays;

/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-set-2-campus/
 * Remove unbalanced parentheses in a given expression.
 *
 *  Eg.) Input  : ((abc)(f(de))
 *  Output : ((abc)(de))
 *
 *  Input  : (((ab)
 *  Output : (ab)
*/
import java.util.Arrays;
public class UnbalancedParentheses {

    int openBracket = 0;
    int closeBracket = 0;
    int extraOpenBrackets = 0;
    int extraCloseBrackets = 0;

    private void balancedParenthesis(String input) {
        int length = input.length();
        char[] inputArray = new char[length];

        changeToArray(input, inputArray);
        countBrackets(inputArray);
        unbalanceCount();
        removalOfExtraBrackets(inputArray);
    }

    private void removalOfExtraBrackets(char[] inputArray) {
        while(this.extraOpenBrackets > 0) {
            String newArray = "";
            int newArrayLength = inputArray.length - extraOpenBrackets; //To remove the extra
            for(int i = 0; i < inputArray.length; i++) {
                if(inputArray[i] == '(') {
                    for(int j = i + 1; j < inputArray.length; j++){
                        inputArray[i++] = inputArray[j]; //Replacing each element with the next element
                    }
                    this.extraOpenBrackets--;
                }
            }
            for(int k = 0; k < newArrayLength; k++) {
                newArray = newArray + inputArray[k]; //Inserting the remaining elements into a new string.
            }
            System.out.println("New Array : " + newArray);
        }
        while(this.extraCloseBrackets > 0) {
            String newArray = "";
            int newArrayLength = inputArray.length - extraCloseBrackets;
            for(int i = 0; i < inputArray.length; i++) {
                if(inputArray[i] == ')') {
                    for(int j = i + 1; j < inputArray.length; j++){
                        inputArray[i++] = inputArray[j];
                    }
                    this.extraCloseBrackets--;
                }
            }
            for(int k = 0; k < newArrayLength; k++) {
                newArray = newArray + inputArray[k];
            }
            System.out.println("New Array : " + newArray);
        }
    }

    private void changeToArray(String input, char[] inputArray) {
        int k = 0;
        for(int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.charAt(k);
            k++;
        }
    }

    private void countBrackets(char[] inputArray) {
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == '(') {
                this.openBracket = openBracket + 1;
            } else if(inputArray[i] == ')') {
                this.closeBracket = closeBracket + 1;
            }
        }
    }

    private void unbalanceCount() {
        if(this.openBracket > this.closeBracket) {
            this.extraOpenBrackets = this.openBracket - this.closeBracket;
        }
        if(this.closeBracket > this.openBracket) {
            this.extraCloseBrackets = this.closeBracket - this.openBracket;
        }
    }

    public static void main(String[] args) {
        String input = "(abc)(de))";
        UnbalancedParentheses parentheses = new UnbalancedParentheses();
        parentheses.balancedParenthesis(input);

    }
}
