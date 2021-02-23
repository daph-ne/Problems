package trainbookings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Unreserved implements Coach {
    static int totalSeats;

    static int totalLower;
    static int totalUpper;

    static int availLower;
    static int availUpper;

    public Unreserved() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        if(dayOfWeek.name().equals("Saturday") || dayOfWeek.name().equals("Sunday")){
            totalSeats = 30;
            totalLower = 15;
            totalUpper = 15;
            availLower = 15;
            availUpper = 15;
        } else {
            totalSeats = 20;
            totalLower = 10;
            totalUpper = 10;
            availLower = 10;
            availUpper = 10;
        }
    }

    @Override
    public void getAvailableSeats() {
        System.out.println("    1. Unreserved (UR) - " + availLower + "L and " + availUpper  + "U seats out of " + totalSeats + " seats are available.");
    }

    @Override
    public void book(String berth, int numberOfSeats) {
        if (berth.equals(Constants.LOWER_BERTH)) {

            if (numberOfSeats > availLower) {
                System.out.println("Sorry, only " + availLower + " seats are left in Lower berth.");
                if (availUpper > 0 && availUpper <= totalUpper) {
                    System.out.println(availUpper + " seats are available in Upper berth.");
                }
            } else if (numberOfSeats > 0 && numberOfSeats <= totalLower) {
                System.out.println(numberOfSeats + " seat(s) have been booked in Lower berth.");
                availLower = availLower - numberOfSeats;
            } else {
                System.out.println("Please book valid number of seats");
            }
        } else if (berth.equals(Constants.UPPER_BERTH)) {
            if (numberOfSeats > availUpper) {
                System.out.println("Sorry, only " + availUpper + " seats are left in Lower berth.");
                if (availLower > 0 && availLower <= totalLower) {
                    System.out.println(availLower + " seats are available in Lower berth.");
                }
            } else if (numberOfSeats > 0 && numberOfSeats <= totalUpper) {
                System.out.println(numberOfSeats + " seat(s) have been booked in Upper berth.");
                availUpper = availUpper - numberOfSeats;
            } else {
                System.out.println("Please book valid number of seats");
            }
        }
    }


    @Override
    public void cancel(String berth, int numberOfSeats) {
        if (berth.equals(Constants.LOWER_BERTH)) {
            availLower = availLower + numberOfSeats;
            if (availLower <= totalLower && availLower > 0) {
                System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
            } else if (availLower > totalLower) {
                System.out.println("Please check and confirm the number of seats.");
                availLower = availLower - numberOfSeats;
            } else {
                System.out.println("Please cancel valid number of seats");
                availLower = availLower - numberOfSeats;
            }
        } else if (berth.equals(Constants.UPPER_BERTH)) {
            availUpper = availUpper + numberOfSeats;
            if (availUpper <= totalUpper && availUpper > 0) {
                System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
            } else if (availUpper > totalUpper) {
                System.out.println("Please check and confirm the number of seats.");
                availUpper = availUpper - numberOfSeats;
            } else {
                System.out.println("Please cancel valid number of seats");
                availUpper = availUpper - numberOfSeats;
            }
        }
    }
}
