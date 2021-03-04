/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-experience-set-27-off-campus-software-developer/
 *  Print true if second string is a substring of first string, else print false.
 *
 * Note : * symbol can replace n number of characters
 * Input : Spoon  Sp*n  Output : TRUE
 *     Zoho     *o*o  Output : TRUE
 *     Man       n*     Output : FALSE
 *     Subline  line   Output : TRUE
 */

public class SubString {

    private boolean extraStar(String substring, String word, int i, int j) {
        if((substring.charAt(i - 1) == '*' && substring.charAt(i - 2) == word.charAt((i - 1))) ||
        (substring.charAt(0) == '*' && substring.charAt(1) == word.charAt((0)))){
            return false;
        }
        return true;
    }

    private boolean subString(String substring, String word, int i, int j) {
        if(i == 0)
            return true;
        if(j == 0)
            return  false;
        if (substring.charAt(i - 1) == word.charAt(j - 1)) {
            return subString(substring, word, i - 1, j - 1);
        } else if (substring.charAt(i - 1) == '*') {
            return subString(substring, word, i - 1, j);
        } else {
            return subString(substring,word, i, j - 1);
        }
    }

    public static void main(String[] args) {
        String substring = "sp*n";
        String word = "spoon";
        int i = substring.length();
        int j = word.length();
        SubString ss = new SubString();
        boolean extraStar =  ss.subString(substring, word, i ,j);
        if(extraStar) {
            boolean output = ss.subString(substring, word, i ,j);
            if(output) {
                System.out.print("TRUE");
            } else {
                System.out.print("FALSE");
            }
        } else {
            System.out.print("FALSE");
        }
    }
}
