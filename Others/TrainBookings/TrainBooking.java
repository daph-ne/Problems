package TrainBookings;

import java.util.Scanner;

public class TrainBooking {
    int totalUR = 20;
    int totalSL = 10;
    int totalAC = 10;

    int totalURLower = 10;
    int totalURUpper = 10;
    int totalSLLower = 5;
    int totalSLUpper = 5;
    int totalACLower = 5;
    int totalACUpper = 5;

    static int availURLower = 10;
    static int availURUpper = 10;
    static int availSLLower = 5;
    static int availSLUpper = 5;
    static int availACLower = 5;
    static int availACUpper = 5;

    final int UNRESERVED = 1;
    final int SLEEPER = 2;
    final int AIR_CONDITIONED = 3;
    static final int LIST_OF_COACHES = 1;
    static final int BOOK_TICKETS = 2;
    static final int CANCEL_TICKETS = 3;
    static final int EXIT = 4;

    private void list() {

        System.out.println("LIST OF COACHES :");
        System.out.println("    1. Unreserved (UR) - " + availURLower + "L and " + this.availURUpper  + "U seats out of " + totalUR + " seats are available.");
        System.out.println("    2. Sleeper (SL) - " + this.availSLLower + "L and " + this.availSLUpper  + "U seats out of " + totalSL + " seats are available.");
        System.out.println("    3. Air-Conditioned (AC)- " + this.availACLower + "L and " + this.availACUpper  + "U seats out of " + totalAC + " seats are available.");
        System.out.println("Click enter to continue.");
    }

    private void bookTickets() {
        System.out.println("WElCOME");
        System.out.println("Do you prefer");
        System.out.println("    1 => Unreserved (UR)");
        System.out.println("    2 => Sleeper (SL) or");
        System.out.println("    3 => Air-Conditioned (AC)?");
        Scanner book = new Scanner(System.in);
        int option = book.nextInt();
        System.out.println("Enter number of seats : ");
        int numberOfSeats = book.nextInt();
        book.nextLine();
        System.out.println("Enter berth - Lower(L) or Upper(U)");
        String berth = book.nextLine();
        if (option == UNRESERVED) {
            if (berth.equals("L")) {
                if (numberOfSeats > availURLower) {
                    System.out.println("Sorry, only " + availURLower + " seats are left in Lower berth.");
                    if (availURUpper > 0 && availURUpper <= totalURUpper) {
                        System.out.println(availURUpper + " seats are available in Upper berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalURLower) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Lower berth.");
                    availURLower = availURLower - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            } else if (berth.equals("U")) {
                if (numberOfSeats > availURUpper) {
                    System.out.println("Sorry, only " + availURUpper + " seats are left in Lower berth.");
                    if (availURLower > 0 && availURLower <= totalURLower) {
                        System.out.println(availURLower + " seats are available in Lower berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalURUpper) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Upper berth.");
                    availURUpper = availURUpper - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            }
        } else if (option == SLEEPER) {
            if (berth.equals("L")) {
                if (numberOfSeats > this.availSLLower) {
                    System.out.println("Sorry, only " + this.availSLLower + " seats are left in Lower berth.");
                    if (this.availSLUpper > 0 && this.availSLUpper <= totalSLUpper) {
                        System.out.println(this.availURUpper + " seats are available in Upper berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalSLLower) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Lower berth.");
                    this.availSLLower = availSLLower - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            } else if (berth.equals("U")) {
                if (numberOfSeats > this.availSLUpper) {
                    System.out.println("Sorry, only " + this.availSLUpper + " seats are left in Lower berth.");
                    if (this.availSLLower > 0 && this.availSLLower <= totalSLLower) {
                        System.out.println(this.availSLLower + " seats are available in Lower berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalSLUpper) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Upper berth.");
                    this.availSLUpper = availSLUpper - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            }
        } else if (option == AIR_CONDITIONED) {
            if (berth.equals("L")) {
                if (numberOfSeats > this.availACLower) {
                    System.out.println("Sorry, only " + this.availACLower + " seats are left in Lower berth.");
                    if (this.availACUpper > 0 && this.availACUpper <= totalACUpper) {
                        System.out.println(this.availACUpper + " seats are available in Upper berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalACLower) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Lower berth.");
                    this.availACLower = availACLower - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            } else if (berth.equals("U")) {
                if (numberOfSeats > this.availACUpper) {
                    System.out.println("Sorry, only " + this.availACUpper + " seats are left in Lower berth.");
                    if (this.availACLower > 0 && this.availACLower <= totalACLower) {
                        System.out.println(this.availACLower + " seats are available in Lower berth.");
                    }
                } else if (numberOfSeats > 0 && numberOfSeats <= totalACUpper) {
                    System.out.println(numberOfSeats + " seat(s) have been booked in Upper berth.");
                    this.availACUpper = availACUpper - numberOfSeats;
                } else {
                    System.out.println("Please book valid number of seats");
                }
            }
        }
    }

    private void cancelTickets() {
        System.out.println("Do you want to cancel the seats booked in ");
        System.out.println("    1 => Unreserved (UR)");
        System.out.println("    2 => Sleeper (SL) or");
        System.out.println("    3 => Air-Conditioned (AC)?");
        Scanner cancel = new Scanner(System.in);
        int option = cancel.nextInt();
        System.out.println("Enter number of seats : ");
        int numberOfSeats = cancel.nextInt();
        cancel.nextLine();
        System.out.println("Enter berth - Lower(L) or Upper(U)");
        String berth = cancel.nextLine();
        if (option == UNRESERVED) {
            if (berth.equals("L")) {
                this.availURLower = availURLower + numberOfSeats;
                if (this.availURLower <= totalURLower && this.availURLower > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availURLower > totalURLower) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availURLower = availURLower - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availURLower = availURLower - numberOfSeats;
                }
            } else if (berth.equals("U")) {
                this.availURUpper = availURUpper + numberOfSeats;
                if (this.availURUpper <= totalURUpper && this.availURUpper > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availURUpper > totalURUpper) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availURUpper = availURUpper - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availURUpper = availURUpper - numberOfSeats;
                }
            }
        } else if (option == SLEEPER) {
            if (berth.equals("L")) {
                this.availSLLower = availSLLower + numberOfSeats;
                if (this.availSLLower <= totalSLLower && this.availSLLower > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availSLLower > totalSLLower) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availSLLower = availSLLower - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availURLower = availSLLower - numberOfSeats;
                }
            } else if (berth.equals("U")) {
                this.availSLUpper = availSLUpper + numberOfSeats;
                if (this.availSLUpper <= totalSLUpper && this.availSLUpper > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availSLUpper > totalSLUpper) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availSLUpper = availSLUpper - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availSLUpper = availSLUpper - numberOfSeats;
                }
            }
        } else if (option == AIR_CONDITIONED) {
            if (berth.equals("L")) {
                this.availACLower = availACLower + numberOfSeats;
                if (this.availACLower <= totalACLower && this.availACLower > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availACLower > totalACLower) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availACLower = availACLower - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availACLower = availACLower - numberOfSeats;
                }
            } else if (berth.equals("U")) {
                this.availACUpper = availACUpper + numberOfSeats;
                if (this.availACUpper <= totalACUpper && this.availACUpper > 0) {
                    System.out.println(numberOfSeats + " seat(s) have been cancelled in Lower berth.");
                } else if (this.availACUpper > totalACUpper) {
                    System.out.println("Please check and confirm the number of seats.");
                    this.availACUpper = availACUpper - numberOfSeats;
                } else {
                    System.out.println("Please cancel valid number of seats");
                    this.availACUpper = availACUpper - numberOfSeats;
                }
            }
        }
    }

    public static void main (String[]args){
        while (true) {
            System.out.println("Choose one : ");
            System.out.println("    1. List of Coaches");
            System.out.println("    2. Book Tickets");
            System.out.println("    3. Cancel Tickets");
            System.out.println("    4. Exit");
            Scanner train = new Scanner(System.in);
            int choice = train.nextInt();
            if (choice == LIST_OF_COACHES) {
                TrainBooking tr = new TrainBooking();
                tr.list();
                train.nextLine();
                String option1 = train.nextLine();

            } else if (choice == BOOK_TICKETS) {
                TrainBooking tr = new TrainBooking();
                tr.bookTickets();

            } else if (choice == CANCEL_TICKETS) {
                TrainBooking tr = new TrainBooking();
                tr.cancelTickets();
            } else if (choice == EXIT) {
                System.out.println("THANK YOU..!!");
                break;

            } else {
                System.out.println("Invalid Choice..!!!");
            }
        }
    }
}

