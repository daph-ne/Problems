/** 
* Link - https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
* 3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
*
* w	e	L	C	O
* M	E	T	O	Z
* O	H	O	C	O
* R	P	O	R	A
* T	I	O	n	  
*
* And print the start and ending index as
*
* Start index : <1,2>
* End index: <3, 2>
*/

class StringToTwoDimensional {
    int row;
    int column;
    private char[][] convertToGrid (String given) {
        int length = given.length();
        int k = 0;
        int i;
        int j;
        row = (int) Math.ceil(Math.sqrt(length)); //Since there are 24 alphabets, we need 5 * 5 grid. (squareroot)
        column = (int) Math.ceil(Math.sqrt(length)); //Math.ceil - gives greater whole number

        char[][] stringToGrid = new char[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (k < length) {
                    stringToGrid[i][j] = given.charAt(k);
                    k++;
                }
                System.out.print(stringToGrid[i][j] + " ");
            }
            System.out.println();
        }
        return stringToGrid;
    }

    private void checkForSubstring(char[][] stringToGrid, String targetStr) {
        for (int i = 0; i < row - targetStr.length() + 1; i++) {
            for (int j = 0; j < column - targetStr.length() + 1; j++) {
                boolean isPresentHorizontally = checkHorizontal(i, j, targetStr, stringToGrid);
                boolean isPresentVertically = checkVertical(i, j, targetStr, stringToGrid);

                if (isPresentHorizontally) {
                    printResult(i, j, i, j + targetStr.length() - 1); //To prevent the index from going out of bounds
                    break;
                }
                if (isPresentVertically) {
                    printResult(i, j, i + targetStr.length() - 1, j);
                    break;
                }
            }
        }
    }

    private void printResult(int startRow, int startCol, int endRow, int endCol) {
        System.out.println ("Start index: <" + startRow + "," + startCol + ">");
        System.out.println ("End index: <" + endRow + "," + endCol + ">");
    }

    private boolean checkHorizontal(int i, int j, String targetStr, char[][] stringToGrid) {
        for(int k = 0; k < targetStr.length(); k++) {
            if(stringToGrid[i][j+k] != targetStr.charAt(k)) {
                return false;
            }
        }
        return true;
    }
    private boolean checkVertical(int i, int j, String targetStr, char[][] stringToGrid) {
        for(int k = 0; k < targetStr.length(); k++) {
            if(stringToGrid[i+k][j] != targetStr.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputStr = "WELCOMETOZOHOCORPORATION";
        String targetStr = "TOO";
        StringToTwoDimensional sttd = new StringToTwoDimensional();
        char[][] grid = sttd.convertToGrid(inputStr);
        sttd.checkForSubstring(grid, targetStr);
    }
}
