/**
* Print rupee in different currencies
* Input = [1, 100, 1000, 200, 450]
* Currencies - Rupee, Dollars, Yen, Euro, Pound
*/

public class DifferentCurrencies {
    private void diffCurrencies(int[] input) {
        for(int i = 0; i < input.length; i++) {
            rupee(i, input);
            dollar(i, input);
            yen(i, input);
            euro(i, input);
            pound(i, input);
        }
    }
    private void rupee(int i, int[] input) {
        if(input[i] == 1) {
            System.out.println(input[i] + " Rupee   ");
        } else System.out.println(input[i] + " Rupee");
    }
    private void dollar(int i, int[] input) {
        double inDollar = input[i] * 0.014;
        if(inDollar == 1) {
            System.out.println(inDollar + " Dollar   ");
        } else System.out.println(inDollar + " Dollars");
    }
    private void yen(int i, int[] input) {
        double inYen = input[i] * 1.46;
        if(inYen == 1) {
            System.out.println(inYen + " Yen    ");
        } else System.out.println(inYen + " Yens");
    }
    private void euro(int i, int[] input) {
        double inEuro = input[i] * 0.011;
        if(inEuro == 1) {
            System.out.println(inEuro + " Euro    ");
        } else System.out.println(inEuro + " Euros");
    }
    private void pound(int i, int[] input) {
        double inPound = input[i] * 0.0099;
        if(inPound == 1) {
            System.out.println(inPound + " Pound    ");
        } else System.out.println(inPound + " Pounds");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 100, 1000, 200, 450};
        DifferentCurrencies currencies = new DifferentCurrencies();
        currencies.diffCurrencies(input);
    }
}
