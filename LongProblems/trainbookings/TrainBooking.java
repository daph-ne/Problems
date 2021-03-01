package trainbookings;

import java.util.Scanner;

public class TrainBooking {

    Unreserved ur;
    Sleeper sl;
    AirConditioned ac;

    public TrainBooking() {
        ur = new Unreserved();
        sl = new Sleeper();
        ac = new AirConditioned();
    }

    private void list() {

        System.out.println("LIST OF COACHES :");
        ur.getAvailableSeats();
        sl.getAvailableSeats();
        ac.getAvailableSeats();
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
        if (option == Constants.UNRESERVED) {
            ur.book(berth, numberOfSeats);
        } else if (option == Constants.SLEEPER) {
            sl.book(berth, numberOfSeats);
        } else if (option == Constants.AIR_CONDITIONED) {
            ac.book(berth, numberOfSeats);
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
        if (option == Constants.UNRESERVED) {
            ur.cancel(berth, numberOfSeats);
        } else if (option == Constants.SLEEPER) {
            sl.cancel(berth, numberOfSeats);
        } else if (option == Constants.AIR_CONDITIONED) {
            ac.cancel(berth, numberOfSeats);
        }
    }

    public static void main (String[]args){
        TrainBooking tr = new TrainBooking();
        while (true) {
            System.out.println("Choose one : ");
            System.out.println("    1. List of Coaches");
            System.out.println("    2. Book Tickets");
            System.out.println("    3. Cancel Tickets");
            System.out.println("    4. Exit");
            Scanner train = new Scanner(System.in);
            int choice = train.nextInt();
            if (choice == Constants.LIST_OF_COACHES) {
                tr.list();
                train.nextLine();

            } else if (choice == Constants.BOOK_TICKETS) {
                tr.bookTickets();

            } else if (choice == Constants.CANCEL_TICKETS) {
                tr.cancelTickets();
            } else if (choice == Constants.EXIT) {
                System.out.println("THANK YOU..!!");
                break;

            } else {
                System.out.println("Invalid Choice..!!!");
            }
        }
    }
}

