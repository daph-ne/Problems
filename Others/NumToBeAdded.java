import java.util.Scanner;

public class NumToBeAdded {
    private void addNumToValue(int value1, int total) {
        int value2;
        value2 = total - value1;
        if(value2 >= 0) {
            System.out.println("Value to be added is " + value2);
            System.out.println(value1 + " + " + value2 + " = " + total);
        } else {
            System.out.println("Value to be added is " + value2);
            System.out.println(value1 + " + (" + value2 + ") = " + total);
        }
    }

    public static void main(String[] args) {
        NumToBeAdded addNum = new NumToBeAdded();
        System.out.println("Enter value 1: ");
        Scanner num = new Scanner(System.in);
        int value1 = num.nextInt();
        System.out.println("Enter the total: ");
        int total = num.nextInt();
        addNum.addNumToValue(value1, total);
    }
}
