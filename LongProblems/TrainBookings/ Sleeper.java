package trainbookings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sleeper implements Coach {
    int totalSeats;

    int totalLower;
    int totalUpper;

    int availLower;
    int availUpper;

    @Override
    public void getAvailableSeats() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            totalSeats = 20;
            totalLower = 10;
            totalUpper = 10;
            availLower = 10;
            availUpper = 10;
        } else {
            totalSeats = 10;
            totalLower = 5;
            totalUpper = 5;
            availLower = 5;
            availUpper = 5;
        }
        System.out.println("    1. Sleeper (SL) - " + availLower + "L and " + availUpper  + "U seats out of " + totalSeats + " seats are available.");
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
            this.availLower = availLower + numberOfSeats;
            if (availLower <= totalLower && availLower > 0) {
                System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
            } else if (availLower > totalLower) {
                System.out.println("Please check and confirm the number of seats.");
                this.availLower = availLower - numberOfSeats;
            } else {
                System.out.println("Please cancel valid number of seats");
                availLower = availLower - numberOfSeats;
            }
        } else if (berth.equals(Constants.UPPER_BERTH)) {
            this.availUpper = availUpper + numberOfSeats;
            if (this.availUpper <= totalUpper && availUpper > 0) {
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
