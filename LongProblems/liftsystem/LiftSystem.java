/**
 * Link - https://www.geeksforgeeks.org/zoho-interview-experience-set-27-off-campus-software-developer/
 */

package liftsystem;

import java.util.Scanner;

public class LiftSystem {


    public LiftSystem() {

    }

    int l1 = 0;
    int l2 = 0;
    int l3 = 0;
    int l4 = 0;
    int l5 = 0;

    private void positionOfLift(int lift) {
        if(lift == 1) {
            System.out.println("Lift 1 is on floor " + l1);
        } else if(lift == 2) {
            System.out.println("Lift 2 is on floor " + l2);
        } else if(lift == 3) {
            System.out.println("Lift 3 is on floor " + l3);
        } else if(lift == 4) {
            System.out.println("Lift 4 is on floor " + l4);
        } else if(lift == 5) {
            System.out.println("Lift 5 is on floor " + l5);
        }
    }

    public static void main(String[] args) {
        LiftSystem ls = new LiftSystem();
        System.out.println("Display position of lift 1, 2, 3, 4 or 5?");
        Scanner ip = new Scanner(System.in);
        int lift = ip.nextInt();
        ls.positionOfLift(lift);
        //System.out.println("Floor");
    }
}
