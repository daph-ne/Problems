/**
* Link - https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
* Print the word with odd letters as 
* P         M
*  R      A
*   O  R
*     G
*   O    R
*  R       A
* P          M 
*/

public class WordWithOddLetters {
    public static void main(String[] args){
		String word = "PROGRAM";
		int len = word.length();
        for(int i = 0; i < len; i++){
            int j = len - 1 - i;
            for(int k = 0; k < len; k++) {
                if (k == i || k == j) {
                    System.out.print(word.charAt(k));
                } else {
                    System.out.print(" ");
		}
            }
	System.out.println("");
        }
    }
}
