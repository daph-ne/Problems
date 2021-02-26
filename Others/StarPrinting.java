public class StarPrinting {

    private static void leftStarPattern(int input) {
        int row = input;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** Output:
         *
         * *
         * * *
         * * * *
    */

    private static void rightStarPattern(int input) {
        int row = input;
        for(int i = 0; i < row; i++) {
            for(int j = 2 * (row - i) - 2; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /** Output:
            *
          * *
        * * *
      * * * *
     */

    private static void pyramidStarPattern(int input) {
        int row = input;
        for(int i = 0; i < row; i++) {
            for(int j = row - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /** Output:
            *
           * *
          * * *
         * * * *
     */

    public static void main(String[] args) {
        int input = 4;
        leftStarPattern(input);
        rightStarPattern(input);
        pyramidStarPattern(input);
    }
}
